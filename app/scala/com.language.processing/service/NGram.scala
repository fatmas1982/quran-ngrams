package com.language.processing.service

// Author: Saqib Ali

object NGram {
  
    def generateNGram(signs: List[String], numOfWords: Int): List[(String, Int)] = { // Scala N-gram secret sauce 
    (for( i <- 0 to signs.length-1) yield  signs(i)
      .replaceAll("\\s*\\p{Punct}+\\s*$", "")
      .replaceAll("\\s*\\p{Punct}+\\s*$", "")
      .split(" ")
      .sliding(numOfWords)
      .filter(_.size==numOfWords)
      .toList
      .par.map(_.mkString(" ")).toList
      ).flatten.toList.groupBy(x => x)   
       .toList   
       .par.map{case(ngram, occurrences) => (ngram, occurrences.length)}.toList
       .filter{case(ngram, occurrences) => occurrences > 1 }
  }
  
  
  def longestNGram(signs: List[String]): List[(String, Int)] = {
      val all = ((10 to 24).foldRight(List[(String, Int)]())((i, l) => l ::: generateNGram(signs, i))).sortWith(_._1.length > _._1.length)
      all.par.map(calc(_, all)).toList.distinct.sortBy(_._2).reverse
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