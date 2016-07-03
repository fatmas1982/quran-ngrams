package controllers

import play.api._
import play.api.mvc._
import play.api.cache.Cache
import play.api.Play.current
import scala.util.matching.Regex.Match
import com.language.processing.service._
import com.language.processing.data._
import scala.concurrent.future
import scala.concurrent.{Await, Future}
import scala.util.{Success, Failure}
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.duration._

object Application extends Controller {
  
  
  def main(args: Array[String]): Unit = {
    val numOfWords = 1;
   // val ngrams = generateNGram(numOfWords)
   // ngrams.foreach{case (ngram, freq) => println(ngram+" "+freq)}

  }
    
  def index(numOfWords: Option[Int]) = Action.async {
      val numOfWordsInt : Int = numOfWords.getOrElse(-1)

  val signs = QuranPickthall.getSignsWithSurahNames.map(_(2))
  
  var result = NGram.longestNGram(signs)
  result.map(content => Ok(views.html.index(content, numOfWordsInt)))
}  
    
    
    
/*    
  def index(numOfWords: Option[Int]) = Action {
    val numOfWordsInt : Int = numOfWords.getOrElse(-1)
    val signs = QuranPickthall.getSignsWithSurahNames.map(_(2))
    if (numOfWordsInt == -1){
      var result = NGram.longestNGram(signs)
          result onComplete {
      case Success(content) => {
        Ok(views.html.index(content, numOfWordsInt))
      }
      case Failure(t) => {
        Ok(views.html.index(Nil, numOfWordsInt))
      }
    }
      

    //  Ok(views.html.index(NGram.longestNGram(signs), numOfWordsInt))
    }
    else
      Ok(views.html.index(NGram.generateNGram(signs, numOfWordsInt), numOfWordsInt))
  }*/
  
 def unique(numOfWords: Option[Int]) = Action {
    val numOfWordsInt : Int = if (numOfWords.getOrElse(10) < 1) 1 else numOfWords.getOrElse(1)
    val signs = Quran.getSignsWithSurahNames.map(_(2))
    Ok(views.html.unique(NGram.generateNGram(signs, 2), numOfWordsInt))
  }
  
  
  def legomenon(repeated: Option[Int]) = Action {
    val repeatedInt : Int = repeated.getOrElse(1)
    val signs = QuranArabic.getSignsWithSurahNames
    Ok(views.html.legomenon(Legomenon.getLegomenon(signs, repeatedInt), repeatedInt))
  }
 
  def search(searchText: Option[String]) = Action {
    val ngramString : String = searchText.getOrElse("")
    val signs = Quran.getSignsWithSurahNames
    Ok(views.html.search(QuranSearch.generateSearchResults(signs, ngramString), ngramString))
  } 
}

