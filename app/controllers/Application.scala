package controllers

import play.api._
import play.api.mvc._
import play.api.cache.Cache
import play.api.Play.current
import scala.util.matching.Regex.Match
import com.language.processing.service._
import com.language.processing.data._



object Application extends Controller {
  
  
  def main(args: Array[String]): Unit = {
    val numOfWords = 1;
   // val ngrams = generateNGram(numOfWords)
   // ngrams.foreach{case (ngram, freq) => println(ngram+" "+freq)}

  }
    

  def index(numOfWords: Option[Int]) = Action {
    val numOfWordsInt : Int = if (numOfWords.getOrElse(10) < 5) 5 else numOfWords.getOrElse(10)

    val quran = new Quran
    val signs = quran.getSignsWithSurahNames.map(_(2))

    
    Ok(views.html.index(NGram.generateNGram(signs, numOfWordsInt), numOfWordsInt))
  }
  
  def search(searchText: Option[String]) = Action {
    val ngramString : String = searchText.getOrElse("")
    val quran = new Quran
    val signs = quran.getSignsWithSurahNames
    Ok(views.html.search(NGram.generateSearchResults(signs, ngramString), ngramString))
  }
   
  def unique(numOfWords: Option[Int]) = Action {
    val numOfWordsInt : Int = if (numOfWords.getOrElse(10) < 1) 1 else numOfWords.getOrElse(1)
    val quran = new Quran
    val signs = quran.getSignsWithSurahNames.map(_(2))
    Ok(views.html.unique(NGram.generateUniquePhrases(signs, numOfWordsInt), numOfWordsInt))
  }
  
  
   
    
}

