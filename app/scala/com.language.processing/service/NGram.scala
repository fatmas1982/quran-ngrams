package com.language.processing.service

// Author: Saqib Ali

object NGram {
  
    def generateNGram(signs: List[String], numOfWords: Int): List[(String, Int)] = { // Scala N-gram secret sauce 
    (for( i <- 0 to signs.length-1) yield  signs(i)
      .split(" ")
      .sliding(numOfWords)
      .filter(_.size==numOfWords)
      .toList
      .map(_.mkString(" "))
      ).flatten.toList.groupBy(x => x)   
       .toList   
       .map{case(ngram, occurrences) => (ngram, occurrences.length)}
       .filter{case(ngram, occurrences) => occurrences > 1 }
  }
  
  
  def longestNGram(signs: List[String]): List[(String, Int)] = {
      
      //val  = generateNGram(signs, 24)
      //val six = generateNGram(signs, 23)
      
      //val all = generateNGram(signs, 24) ::: generateNGram(signs, 23) ::: generateNGram(signs, 22) ::: generateNGram(signs, 21) ::: generateNGram(signs, 20)
      
      //for (i <- 10 to 15) yield generateNGram(signs, i)
      
      def concat(i: Int, l: List[(String, Int)]) : List[(String, Int)] = {
          if (i==1) l else l ::: concat(i-1, generateNGram(signs, i))
      }
      
      val all = concat(24, generateNGram(signs, 25))
      all.map(calc(_, all)).distinct
      
      
      
      
  }
  
  def calc(init: (String, Int), l: List[(String, Int)]): (String, Int) = {
    if (l.isEmpty) init
    else if (l.head._1.contains(init._1)) calc(l.head, l.tail)
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