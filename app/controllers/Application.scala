package controllers

import play.api._
import play.api.mvc._
import play.api.cache.Cache
import play.api.Play.current
import scala.util.matching.Regex.Match
import com.language.processing.service._
import com.language.processing.data._



object Application extends Controller {
  
  
  

   

  def generateSearchResults(ngram: String): List[List[String]] = {
    val signs = new QuranWithAya getSignsWithSurahNames
    
    //signs.filter(_(2).contains(ngram))
    signs.filter(_(2).matches("(?i:.*" + ngram + ".*)"))
    
  }


  def main(args: Array[String]): Unit = {
    val numOfWords = 1;
   // val ngrams = generateNGram(numOfWords)
   // ngrams.foreach{case (ngram, freq) => println(ngram+" "+freq)}

  }
    

  def index(numOfWords: Option[Int]) = Action {
    val numOfWordsInt : Int = if (numOfWords.getOrElse(10) < 5) 5 else numOfWords.getOrElse(10)
    val ngram = new Ngram(new QuranWithAya)
    
    Ok(views.html.index(ngram.generateNGram(numOfWordsInt), numOfWordsInt))
  }
  
  def search(ngram: Option[String]) = Action {
    val ngramString : String = ngram.getOrElse("")
    Ok(views.html.search(generateSearchResults(ngramString), ngramString))
  }
   
  def unique(numOfWords: Option[Int]) = Action {
    val numOfWordsInt : Int = if (numOfWords.getOrElse(10) < 1) 1 else numOfWords.getOrElse(1)
    val ngram = new Ngram(new QuranWithAya)

    Ok(views.html.unique(ngram.generateUniquePhrases(numOfWordsInt), numOfWordsInt))
  }
  
  
   
    
}

