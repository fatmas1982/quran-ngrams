package com.language.processing.service

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
  
  
  def longestNGram(signs: List[String]): List[(String, Int)] = {
    //  val all = time {((8 to 24).foldRight(List[(String, Int)]())((i, l) => l ::: generateNGram(signs, i))).sortWith(_._1.length > _._1.length)}
    /*  val all = time {((8 to 24).map(i => generateNGram(signs, i)).reduce(_ ::: _)).sortWith(_._1.length > _._1.length)}
      time {all
      .map(calc(_, all))
      .distinct
      .sortBy(_._2)
      .reverse} 
      */
      
      
        time {
    val fut24 = Future {
      generateNGram(signs, 24).sortWith(_._1.length > _._1.length)
    }
    val fut23 = Future {
      generateNGram(signs, 23).sortWith(_._1.length > _._1.length)
    }
    val fut22 = Future {
      generateNGram(signs, 22).sortWith(_._1.length > _._1.length)
    }
    val fut21 = Future {
      generateNGram(signs, 21).sortWith(_._1.length > _._1.length)
    }
    val fut20 = Future {
      generateNGram(signs, 20).sortWith(_._1.length > _._1.length)
    }
    val fut19 = Future {
      generateNGram(signs, 19).sortWith(_._1.length > _._1.length)
    }
    val fut18 = Future {
      generateNGram(signs, 18).sortWith(_._1.length > _._1.length)
    }
    val fut17 = Future {
      generateNGram(signs, 17).sortWith(_._1.length > _._1.length)
    }
    val fut16 = Future {
      generateNGram(signs, 16).sortWith(_._1.length > _._1.length)
    }
    val fut15 = Future {
      generateNGram(signs, 15).sortWith(_._1.length > _._1.length)
    }
    val fut14 = Future {
      generateNGram(signs, 14).sortWith(_._1.length > _._1.length)
    }
    val fut13 = Future {
      generateNGram(signs, 13).sortWith(_._1.length > _._1.length)
    }
    val fut12 = Future {
      generateNGram(signs, 12).sortWith(_._1.length > _._1.length)
    }
    val fut11 = Future {
      generateNGram(signs, 11).sortWith(_._1.length > _._1.length)
    }
    val fut10 = Future {
      generateNGram(signs, 10).sortWith(_._1.length > _._1.length)
    }
    val fut9 = Future {
      generateNGram(signs, 9).sortWith(_._1.length > _._1.length)
    }
    val fut8 = Future {
      generateNGram(signs, 8).sortWith(_._1.length > _._1.length)
    }
    val fut7 = Future {
      generateNGram(signs, 7).sortWith(_._1.length > _._1.length)
    }
    val fut6 = Future {
      generateNGram(signs, 6).sortWith(_._1.length > _._1.length)
    }
    val fut5 = Future {
      generateNGram(signs, 5).sortWith(_._1.length > _._1.length)
    }
    val fut4 = Future {
      generateNGram(signs, 4).sortWith(_._1.length > _._1.length)
    }
    val fut3 = Future {
      generateNGram(signs, 3).sortWith(_._1.length > _._1.length)
    }
    val fut2 = Future {
      generateNGram(signs, 2).sortWith(_._1.length > _._1.length)
    }

    val alltemp =
        Await.result(fut24, 10 second) ::
        Await.result(fut23, 10 second) ::
        Await.result(fut22, 10 second) ::
        Await.result(fut21, 10 second) ::
        Await.result(fut20, 10 second) ::
        Await.result(fut19, 10 second) ::
        Await.result(fut18, 10 second) ::
        Await.result(fut17, 10 second) ::
        Await.result(fut16, 10 second) ::
        Await.result(fut15, 10 second) ::
        Await.result(fut14, 10 second) ::
        Await.result(fut13, 10 second) ::
        Await.result(fut12, 10 second) ::
        Await.result(fut11, 10 second) ::
    //    Await.result(fut10, 10 second) ::
    //    Await.result(fut9, 10 second) ::
    //    Await.result(fut8, 10 second) ::
    //    Await.result(fut7, 10 second) ::
  //      Await.result(fut6, 10 second) ::
//Await.result(fut5, 10 second) ::
        Nil

    val all = alltemp.flatten
    
    val result = all
      .map(calc(_, all))
      .distinct
      .sortBy(_._2)
      .reverse
    result
    }
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