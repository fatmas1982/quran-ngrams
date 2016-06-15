package controllers

import play.api._
import play.api.mvc._
import play.api.cache.Cache
import play.api.Play.current


object Application extends Controller {
  
  
  
  def generateUniquePhrases(numOfWords: Int): List[(String)] = {

    val signs = new Quran signs

     (for( i <- 0 to signs.length-1) yield  signs(i)
      .split(" ")
      .sliding(numOfWords)
      .toList
      .map(_.mkString(" "))
      ).flatten.toList.distinct
  }
   

  def generateNGram(numOfWords: Int): List[(String, Int)] = {

    val signs = new Quran signs

    (for( i <- 0 to signs.length-1) yield  signs(i)
      .split(" ")
      .sliding(numOfWords)
      .toList
      .map(_.mkString(" "))
      ).flatten.toList.groupBy(x => x)   
       .toList   
       .map{case(ngram, occurrences) => (ngram, occurrences.length)}
       .filter{case(ngram, occurrences) => occurrences > 2 }
  }


  def generateSearchResults(ngram: String): List[List[String]] = {
    val signs = new QuranWithAya getSignsWithSurahNames
    
    signs.filter(_(2).contains(ngram))
    
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
    val numOfWordsInt : Int = if (numOfWords.getOrElse(10) < 2) 2 else numOfWords.getOrElse(2)
      Ok(views.html.unique(generateUniquePhrases(numOfWordsInt), numOfWordsInt))
  }
  
  
   
   
  /*
  
    (for( i <- 0 to signs.length-1) yield  signs(i)
      .split(" ")
      .sliding(numOfWords)
      .toList
      .map(_.mkString(" "))
      ).flatten.toList.distinct
  
  
  */
}

