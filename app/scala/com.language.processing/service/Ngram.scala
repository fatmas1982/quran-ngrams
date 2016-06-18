package com.language.processing.service

import com.language.processing.data._


class Ngram(quran: Quran) {
    
    val signs = quran signs

    
    def generateNGram(numOfWords: Int): List[(String, Int)] = { // Scala N-gram secret sauce 
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
  

}