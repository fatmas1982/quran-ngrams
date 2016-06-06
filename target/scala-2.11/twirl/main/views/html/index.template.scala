
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[scala.Tuple2[String, Int]],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ngrams: List[(String, Int)], numOfWordsInt: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.51*/(""" 

"""),_display_(/*3.2*/main("Quran N-gram Analytics")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""

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
            <td>"""),_display_(/*37.18*/freq),format.raw/*37.22*/("""</td>
            </tr>
            """)))}),format.raw/*39.14*/("""
    """),format.raw/*40.5*/("""</table>
</div>

""")))}))
      }
    }
  }

  def render(ngrams:List[scala.Tuple2[String, Int]],numOfWordsInt:Int): play.twirl.api.HtmlFormat.Appendable = apply(ngrams,numOfWordsInt)

  def f:((List[scala.Tuple2[String, Int]],Int) => play.twirl.api.HtmlFormat.Appendable) = (ngrams,numOfWordsInt) => apply(ngrams,numOfWordsInt)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Mon Jun 06 04:06:04 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/index.scala.html
                  HASH: 36b59bccfe0eb4de8c82f7eb69610fe5dfd949fe
                  MATRIX: 556->1|700->50|729->54|767->84|806->86|834->88|2213->1440|2265->1476|2305->1478|2334->1479|2405->1523|2431->1528|2461->1531|2487->1536|2541->1563|2566->1567|2634->1604|2666->1609
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|58->34|59->35|59->35|59->35|60->36|60->36|60->36|60->36|61->37|61->37|63->39|64->40
                  -- GENERATED --
              */
          