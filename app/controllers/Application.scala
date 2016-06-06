package controllers

import play.api._
import play.api.mvc._
import play.api.cache.Cache
import play.api.Play.current


object Application extends Controller {

  def generateNGram(numOfWordsInput: Int): List[(String, Int)] = {

    val numOfWords = if (numOfWordsInput <  5) 5 else numOfWordsInput
    
    val signs = new Quran signs
    val text = signs.mkString(" ");
    
    val punctuations = List(',', '.', ')', '(', '?', ';', '!', '-', ':')


    val stopWords = Set("a","about","above","across","after","again","against","all","almost","alone","along","already","also","although","always","among","an","and","another","any","anybody","anyone","anything","anywhere","are","area","areas","around","as","ask","asked","asking","asks","at","away","b","back","backed","backing","backs","be","became","because","become","becomes","been","before","began","behind","being","beings","best","better","between","big","both","but","by","c","came","can","cannot","case","cases","certain","certainly","clear","clearly","come","could","d","did","differ","different","differently","do","does","done","down","down","downed","downing","downs","during","e","each","early","either","end","ended","ending","ends","enough","even","evenly","ever","every","everybody","everyone","everything","everywhere","f","face","faces","fact","facts","far","felt","few","find","finds","first","for","four","from","full","fully","further","furthered","furthering","furthers","g","gave","general","generally","get","gets","give","given","gives","go","going","good","goods","got","great","greater","greatest","group","grouped","grouping","groups","h","had","has","have","having","he","her","here","herself","high","high","high","higher","highest","him","himself","his","how","however","i","if","important","in","interest","interested","interesting","interests","into","is","it","its","itself","j","just","k","keep","keeps","kind","knew","know","known","knows","l","large","largely","last","later","latest","least","less","let","lets","like","likely","long","longer","longest","m","made","make","making","man","many","may","me","member","members","men","might","more","most","mostly","mr","mrs","much","must","my","myself","n","necessary","need","needed","needing","needs","never","new","new","newer","newest","next","no","nobody","non","noone","not","nothing","now","nowhere","number","numbers","o","of","off","often","old","older","oldest","on","once","one","only","open","opened","opening","opens","or","order","ordered","ordering","orders","other","others","our","out","over","p","part","parted","parting","parts","per","perhaps","place","places","point","pointed","pointing","points","possible","present","presented","presenting","presents","problem","problems","put","puts","q","quite","r","rather","really","right","right","room","rooms","s","said","same","saw","say","says","second","seconds","see","seem","seemed","seeming","seems","sees","several","shall","she","should","show","showed","showing","shows","side","sides","since","small","smaller","smallest","so","some","somebody","someone","something","somewhere","state","states","still","still","such","sure","t","take","taken","than","that","the","their","them","then","there","therefore","these","they","thing","things","think","thinks","this","those","though","thought","thoughts","three","through","thus","to","today","together","too","took","toward","turn","turned","turning","turns","two","u","under","until","up","upon","us","use","used","uses","v","very","w","want","wanted","wanting","wants","was","way","ways","we","well","wells","went","were","what","when","where","whether","which","while","who","whole","whose","why","will","with","within","without","work","worked","working","works","would","x","y","year","years","yet","you","young","younger","youngest","your","yours","z")

   val occuranceThreshold = if (numOfWords==1) 0 else 3
   
   val words = if (numOfWords==1) text.split(" ").map(_.filterNot(x => punctuations contains x)) // Split text into words and remove puntuation marks if 1 word n-grams
   else 
   text.split(" ")
   
         
    
    
    
    
    //Scala recipe for creating n-grams using words.
    val m = words.sliding(numOfWords)
    .toList
    .map(_.mkString(" "))
    .groupBy(x => x)
    .map{case(ngram, occurrences) => (ngram, occurrences.length)}
    .filter{case(ngram, occurrences) => occurrences > occuranceThreshold }
    .toList
    .sortBy{case(ngram, occurrences) => occurrences}.reverse

    if (numOfWords==1) {
      m.filterNot{case(ngram, repeat) => stopWords contains ngram}
    }
    else m

    
  }



def generateSignsNGram(numOfSignsInput: Int): List[(String, Int)] = {

    val signs = new Quran signs

     val m = signs.sliding(2)
      .toList
      .map(_.mkString(" "))
      .groupBy(x => x)
      .map{case(ngram, occurrences) => (ngram, occurrences.length)}
      .filter{case(ngram, occurrences) => occurrences > 1 }
      .toList
     m
  }




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

