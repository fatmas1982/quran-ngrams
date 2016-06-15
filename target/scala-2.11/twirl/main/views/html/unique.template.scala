
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object unique_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class unique extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[scala.Tuple2[String, Int]],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ngrams: List[(String, Int)], numOfWords: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/(""" 

"""),_display_(/*3.2*/main("Quran Analysis: " + numOfWords + " word N-grams in Quran")/*3.66*/ {_display_(Seq[Any](format.raw/*3.68*/("""

"""),format.raw/*5.1*/("""<div class="jumbotron text-center">
    <div class="container">

        <p class="text-right">
            <a class="github-button" href="https://github.com/saqib-ali/quran-ngrams" data-style="mega" data-count-href="/saqib-ali/quran-ngrams/stargazers" data-count-api="/repos/saqib-ali/quran-ngrams#stargazers_count" data-count-aria-label="# stargazers on GitHub"
            aria-label="Star saqib-ali/quran-ngrams on GitHub">Star</a>
        </p>

        <h1>Quran N-gram Analytics</h1>
        <p>This Scala app lets you perform n-gram Analytics on the English Translation of Quran</p>


        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=10"></span>10 words n-grams</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=11"></span>11 words n-grams</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=12"></span>12 words n-grams</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=13"></span>13 words n-grams</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=14"></span>14 words n-grams</a>

    </div>

</div>
<div class="container">
    <table class="table table-hover">
        <thead>
            <tr>
                <th>N-gram</th>
                <th>Repeated</th>
            </tr>
        </thead>
        """),_display_(/*34.10*/for((ngram, freq) 
        <- ngrams) yield /*35.19*/ {_display_(Seq[Any](format.raw/*35.21*/(""" """),format.raw/*35.22*/("""<tr>
            <td><a href="search?ngram="""),_display_(/*36.40*/ngram),format.raw/*36.45*/("""">"""),_display_(/*36.48*/ngram),format.raw/*36.53*/("""</a></td>
            </tr>
            """)))}),format.raw/*38.14*/("""
    """),format.raw/*39.5*/("""</table>
</div>

""")))}))
      }
    }
  }

  def render(ngrams:List[scala.Tuple2[String, Int]],numOfWords:Int): play.twirl.api.HtmlFormat.Appendable = apply(ngrams,numOfWords)

  def f:((List[scala.Tuple2[String, Int]],Int) => play.twirl.api.HtmlFormat.Appendable) = (ngrams,numOfWords) => apply(ngrams,numOfWords)

  def ref: this.type = this

}


}

/**/
object unique extends unique_Scope0.unique
              /*
                  -- GENERATED --
                  DATE: Wed Jun 15 14:24:07 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/unique.scala.html
                  HASH: 108dbdedb3ad530c6431e8dabdcfbf4947825210
                  MATRIX: 558->1|699->47|728->51|800->115|839->117|867->119|2246->1471|2299->1508|2339->1510|2368->1511|2439->1555|2465->1560|2495->1563|2521->1568|2593->1609|2625->1614
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|58->34|59->35|59->35|59->35|60->36|60->36|60->36|60->36|62->38|63->39
                  -- GENERATED --
              */
          