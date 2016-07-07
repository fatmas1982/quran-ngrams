package com.language.processing.service

import scala.collection.mutable.ListBuffer

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import scala.concurrent.future
import scala.concurrent.{Await, Future}
import scala.util.{Success, Failure}
import scala.collection.parallel.immutable.ParVector
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

// Author: Saqib Ali

object NGram {
  
    def generateNGram(signs: List[String], numOfWords: Int): List[(String, Int)] = { // Scala N-gram secret sauce 
    (for( i <- 0 to signs.length-1) yield  signs(i)
      .replaceAll("([\\p{P}&&[^()]]+\\s*)+$", "")
      .replaceAll("([\\p{P}&&[^()]]+\\s*)+$", "")
      .split(" ")
      .sliding(numOfWords)
      .filter(_.size==numOfWords)
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

  def time[R](block: => R): R = { //Profile methods / code in Scala. Useful in timining the execution of scala code source: http://stackoverflow.com/q/9160001/420558
    val t0 = System.nanoTime()
    val result = block    
    val t1 = System.nanoTime()
    println("Elapsed time: " + (t1 - t0)/1000000000 + "s")
    result
}
  
  
  def generateNGramFuture(signs: List[String], numOfWords: Int): Future[List[(String, Int)]] = Future{ // Scala N-gram secret sauce
    (for( i <- 0 to signs.length-1) yield  signs(i)
      .replaceAll("([\\p{P}&&[^()]]+\\s*)+$", "")
      .replaceAll("([\\p{P}&&[^()]]+\\s*)+$", "")
      .split(" ")
      .sliding(numOfWords)
      .filter(_.size==numOfWords)
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
  
  def longestNGram(signs: List[String]): List[(String, Int)] = {
    //  val all = time {((8 to 24).foldRight(List[(String, Int)]())((i, l) => l ::: generateNGram(signs, i))).sortWith(_._1.length > _._1.length)}
   /*   val all = time {((8 to 24).map(i => generateNGram(signs, i)).reduce(_ ::: _)).sortWith(_._1.length > _._1.length)}
      time {all
      .map(calc(_, all))
      .distinct
      .sortBy(_._2)
      .reverse} */
      
      
        time {


    var allBuffer = new ListBuffer[(String, Int)]()

    def addToFruits(values: List[(String, Int)]) = {

      values.foreach(allBuffer += _)

    }


    (17 to 24).foreach(
      generateNGramFuture(signs, _).onComplete {
        case Success(value) => addToFruits(value)
        case Failure(ex) => println("This grinder needs a replacement, seriously!")
      }
    )


    sleep(10000)



    val all = allBuffer.toList

    val result = all
      .map(calc(_, all))
      .distinct
      .sortBy(_._2)
      .reverse

    result


  }
      
  }
     
  def sleep(time: Long) { Thread.sleep(time) }
   
  
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