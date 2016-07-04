package com.language.processing.service

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import scala.concurrent.future
import scala.concurrent.{Await, Future}
import scala.util.{Success, Failure}

import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

// Author: Saqib Ali

object NGram {
  
    def generateNGram(signs: List[String], numOfWords: Int): List[(String, Int)] = { // Scala N-gram secret sauce 
    
 

    
   // println(sc.toString);
    
    (for( i <- 0 to signs.length-1) yield  signs(i)
      .replaceAll("([\\p{P}&&[^()]]+\\s*)+$", "")
      .replaceAll("([\\p{P}&&[^()]]+\\s*)+$", "")
      .split(" ")
      .sliding(numOfWords)
      .filter(_.size==numOfWords)
      .toList
      .map(_.mkString(" "))
      //.map(_.replaceAll("[\\p{P}\\s]+$", ""))
      //.map(_.replaceAll("[\\p{P}\\s]+$", ""))


    )
       .flatten
       .groupBy(x => x)   
       .toList   
       .map{case(ngram, occurrences) => (ngram, occurrences.length)}
       .filter{case(ngram, occurrences) => occurrences > 1}
  }
  
  
  
  
  

  
  def time[R](block: => R): R = {
    val t0 = System.nanoTime()
    val result = block    // call-by-name
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0)/1000000000 + "s")
    result
}
  
  
  def longestNGram(signs: List[String]): List[(String, Int)] = {
    
       val conf = new SparkConf()
        .setMaster(System.getenv("spark_cluster"))
        .setAppName("Simple Application")
        val sc = new SparkContext(conf)
    
    
    //  val all = time {((8 to 24).foldRight(List[(String, Int)]())((i, l) => l ::: generateNGram(signs, i))).sortWith(_._1.length > _._1.length)}
    //  val all = time {((7 to 24).map(i => generateNGram(signs, i)).reduce(_ ::: _)).sortWith(_._1.length > _._1.length)}
    
   // val all = time {sc.parallelize(24 to 24).map(i => generateNGram(signs, i)).reduce(_ ::: _)}
      val all = time {sc.parallelize(24 to 24).map(i => generateNGram(signs, i)).collect}

      sc.stop
      
      
      
      time {all
      .sortWith(_._1.length > _._1.length)
      .map(calc(_, all))
      .distinct
      .sortBy(_._2)
      .reverse} 
//      ngrams.collect.toList
      
  }
     
  
  def calc(init: (String, Int), l: List[(String, Int)]): (String, Int) = {
    if (l.isEmpty) init
    else if (l.head._1.contains(init._1)) l.head
    else calc(init, l.tail)
  }
  
  
  
  def generateUniquePhrases(signs: List[String], numOfWords: Int = 1): List[(String, Int)] = {
    
    val punctuationSet = (")(,.?;!:").toSet
    (for( i <- 0 to signs.length-1) yield  signs(i)
      .split(" ")
      .map(x => x.filterNot(punctuationSet.contains(_)))
      ).flatten.toList.groupBy(x => x.toLowerCase)   
       .toList
       .map{case(ngram, occurrences) => (ngram, occurrences.length)}
       .map{case(ngram, occurrences) => (ngram.capitalize, occurrences)}
 }

  
}