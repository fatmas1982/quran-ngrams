package com.language.processing.service

object Related {
      def generateRelations(signs: List[List[String]], repeated: Int = 1): List[(String, List[List[String]])] = {
            
      val punctuationSet = (")(,.?;!:").toSet

      (for( i <- 0 to signs.length-1) yield  signs(i)(2)
            .split(" ")
            .map(x => signs(i).patch(2, List(x.filterNot(punctuationSet.contains(_))), 0))
      )
      .toList
      .flatten
      .groupBy{case(List(chapter, verse, word, text, city)) => word}
      .toList
      .filter{case(ngram, occurrences) => occurrences.length == repeated }
      }
}

  
    

