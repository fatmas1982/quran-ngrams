package controllers

import play.api._
import play.api.mvc._
import play.api.cache.Cache
import play.api.Play.current
import scala.util.matching.Regex.Match


object Application extends Controller {
  
  
  
  def generateUniquePhrases(numOfWords: Int = 1): List[(String, Int)] = {
    
  val punctuationSet = (")(,.?;!:").toSet
  
  val signs = new Quran signs

   (for( i <- 0 to signs.length-1) yield  signs(i)
      .split(" ")
      .map(x => x.filterNot(punctuationSet.contains(_)))
      ).flatten.toList.groupBy(x => x.toLowerCase)   
       .toList
       .map{case(ngram, occurrences) => (ngram, occurrences.length)}
       .map{case(ngram, occurrences) => (ngram.capitalize, occurrences)}
       .filter{case(ngram, occurrences) => occurrences < 2 }
  }
   

  def generateNGram(numOfWords: Int): List[(String, Int)] = { // Scala N-gram secret sauce 

    val signs = new Quran signs

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


  def generateSearchResults(ngram: String): List[List[String]] = {
    val signs = new QuranWithAya getSignsWithSurahNames
    
    //signs.filter(_(2).contains(ngram))
    signs.filter(_(2).matches("(?i:.*" + ngram + ".*)"))
    
  }


  def main(args: Array[String]): Unit = {
    val numOfWords = 1;
    val ngrams = generateNGram(numOfWords)
    ngrams.foreach{case (ngram, freq) => println(ngram+" "+freq)}

  }
    

  def index(numOfWords: Option[Int]) = Action {
    val numOfWordsInt : Int = if (numOfWords.getOrElse(10) < 5) 5 else numOfWords.getOrElse(10)
      Ok(views.html.index(generateNGram(numOfWordsInt), numOfWordsInt))
  }
  
  def search(ngram: Option[String]) = Action {
    val ngramString : String = ngram.getOrElse("")
    Ok(views.html.search(generateSearchResults(ngramString), ngramString))
  }
   
  def unique(numOfWords: Option[Int]) = Action {
    val numOfWordsInt : Int = if (numOfWords.getOrElse(10) < 1) 1 else numOfWords.getOrElse(1)
      Ok(views.html.unique(generateUniquePhrases(numOfWordsInt), numOfWordsInt))
  }
  
  
   
    
}

