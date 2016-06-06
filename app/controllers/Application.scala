package controllers

import play.api._
import play.api.mvc._
import play.api.cache.Cache
import play.api.Play.current


object Application extends Controller {

  def generateNGram(numOfWordsInput: Int): List[(String, Int)] = {

    val numOfWords = if (numOfWordsInput <  5) 5 else numOfWordsInput
    
    val signs = new Quran signs

    val m = (for( i <- 0 to signs.length-1) yield  signs(i)
      .split(" ")
      .sliding(numOfWords)
      .toList
      .map(_.mkString(" "))
      ).flatten.toList.groupBy(x => x)   
       .toList   
       .map{case(ngram, occurrences) => (ngram, occurrences.length)}
       .filter{case(ngram, occurrences) => occurrences > 2 }
      
      
     m

    
  }



def generateSignsNGram(numOfSignsInput: Int): List[(String, Int)] = {

    val signs = new Quran signs

    val m = (for( i <- 0 to signs.length-1) yield  signs(i)
      .split(" ")
      .sliding(2)
      .toList
      .map(_.mkString(" "))
      ).flatten.toList.groupBy(x => x)   
       .toList   
       .map{case(ngram, occurrences) => (ngram, occurrences.length)}
       .filter{case(ngram, occurrences) => occurrences >1 }
      
      
     m
  }


/*
def generateSignsNGram(numOfSignsInput: Int): List[(String, Int)] = {

    val signs = new Quran signs

    val m = (for( i <- 2 to 20) yield  signs.sliding(i)
      .toList
      .map(_.mkString(" "))
      .groupBy(x => x)
      .map{case(ngram, occurrences) => (ngram, occurrences.length)}
      .filter{case(ngram, occurrences) => occurrences > 1 }
      .toList
      )
      .toList
      .flatten
      
     m
  }*/






  def generateSearchResults(ngram: String): List[(String)] = {
    val signs = new Quran signs
    val signsList = signs.toList
    signsList.filter(_.contains(ngram))
  }


  def main(args: Array[String]): Unit = {
    val numOfWords = 1;
    val ngrams = generateNGram(numOfWords)
    ngrams.foreach{case (ngram, freq) => println(ngram+" "+freq)}
    //val searchResults = generateSearchResults("Resurrection")
    //searchResults.foreach(println)

  }
    

  def index(numOfWords: Option[Int]) = Action {
    val numOfWordsInt : Int = numOfWords.getOrElse(10)
      Ok(views.html.index(generateNGram(numOfWordsInt)))
  }
  
  def signs(numOfSigns: Option[Int]) = Action {
    val numOfSignsInt : Int = numOfSigns.getOrElse(2)
      Ok(views.html.index(generateSignsNGram(numOfSignsInt)))
  }

  def search(ngram: Option[String]) = Action {
    val ngramString : String = ngram.getOrElse("")
    

    Ok(views.html.search(generateSearchResults(ngramString), ngramString))
  }
}

