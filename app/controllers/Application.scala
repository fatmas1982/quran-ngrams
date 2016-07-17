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
    val numOfWordsInt : Int = numOfWords.getOrElse(-1)
    val signs = QuranPickthall.getSignsWithSurahNames.map(_(2))
    if (numOfWordsInt == -1)
      Ok(views.html.index(NGram.longestNGram(signs), numOfWordsInt))
    else
      Ok(views.html.index(NGram.generateNGram(signs, numOfWordsInt), numOfWordsInt))
  }
  

  
  
  def legomenon(repeated: Option[Int]) = Action {
    val repeatedInt : Int = repeated.getOrElse(1)
    val signs = QuranPickthall.getSignsWithSurahNames
    Ok(views.html.legomenon(Legomenon.getLegomenon(signs, repeatedInt), repeatedInt))
  }
 
  def search(searchText: Option[String]) = Action {
    val ngramString : String = searchText.getOrElse("")
    val signs = QuranPickthall.getSignsWithSurahNames
    Ok(views.html.search(QuranSearch.generateSearchResults(signs, ngramString), ngramString))
  } 
}

