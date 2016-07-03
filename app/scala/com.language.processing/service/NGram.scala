package com.language.processing.service

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import scala.concurrent.future
import scala.concurrent.{Await, Future}

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
  
  
  
  
  
   def generateNGramFuture(signs: List[String], numOfWords: Int): Future[List[(String, Int)]] = Future { // Scala N-gram secret sauce 
    (for( i <- 0 to signs.length-1) yield  signs(i)
      .replaceAll("([\\p{P}&&[^()]]+\\s*)+$", "")
      .replaceAll("([\\p{P}&&[^()]]+\\s*)+$", "")
      .split(" ")
      .sliding(numOfWords)
      .filter(_.size==numOfWords)
      .toList
      .map(_.mkString(" "))
    )
       .flatten
       .groupBy(x => x)   
       .toList   
       .map{case(ngram, occurrences) => (ngram, occurrences.length)}
       .filter{case(ngram, occurrences) => occurrences > 1}
  }
  
  
  
  
  def longestNGram(signs: List[String]): List[(String, Int)] = {
    
       val conf = new SparkConf()
    .setMaster(System.getenv("spark_cluster"))
    .setAppName("Simple Application")
//    val sc = new SparkContext(conf)
    
    val ngrams = Nil
      val all = ((8 to 24).foldRight(List[(String, Int)]())((i, l) => l ::: generateNGram(signs, i)))
      
      
      val result24  = generateNGramFuture(signs, 24)
      val result23  = generateNGramFuture(signs, 23)
      val result22  = generateNGramFuture(signs, 22)
      
      
       val result = for {
        r24 <- result24
        r23 <- result23
        r22 <- result22
    } yield (r24 ::: r23 ::: r22)
      
      
       result onSuccess {
        case result => {ngrams :: result}
      }
      
      
      
     // val ngrams = Await.result

      
      all
      
      
      /*

//      val distData = sc.parallelize(all)
/*      
      val ngrams = distData.map(calc(_, all))
            .distinct
            .sortBy(_._2)
*/

      

      sc.stop

      all.sortWith(_._1.length > _._1.length)
      .map(calc(_, all))
      .distinct
      .sortBy(_._2)
      .reverse 
//      ngrams.collect.toList
      */
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