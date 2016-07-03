
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
  def apply/*1.2*/(ngrams: List[(String, Int)], numOfWords: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.48*/(""" 


"""),_display_(/*4.2*/main("Quran Analysis: " + numOfWords + " word N-grams in Quran")/*4.66*/ {_display_(Seq[Any](format.raw/*4.68*/("""

"""),format.raw/*6.1*/("""<div class="jumbotron text-center">
    <div class="container">

        <p class="text-right">
            <a class="github-button" href="https://github.com/saqib-ali/quran-ngrams" data-style="mega" data-count-href="/saqib-ali/quran-ngrams/stargazers" data-count-api="/repos/saqib-ali/quran-ngrams#stargazers_count" data-count-aria-label="# stargazers on GitHub"
            aria-label="Star saqib-ali/quran-ngrams on GitHub">Star</a>
        </p>

        <h1>Quran N-gram Analytics</h1>
        <p>This Scala app lets you perform n-gram Analytics on the English Translation of Quran</p>

        <a type="button" class="btn btn-lg btn-default" href="/"></span>Home</a>
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
        """),_display_(/*35.10*/for((ngram, freq)
        <- ngrams) yield /*36.19*/ {_display_(Seq[Any](format.raw/*36.21*/(""" """),format.raw/*36.22*/("""<tr>
            <td><a href="search?ngram="""),_display_(/*37.40*/ngram),format.raw/*37.45*/("""">"""),_display_(/*37.48*/ngram),format.raw/*37.53*/("""</a></td>
            <td>"""),_display_(/*38.18*/freq),format.raw/*38.22*/("""</td>
            </tr>
            """)))}),format.raw/*40.14*/("""
    """),format.raw/*41.5*/("""</table>
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sat Jul 02 22:37:40 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/index.scala.html
                  HASH: c84f4ccf8febdb02d2aab10879267ee3283a5ea9
                  MATRIX: 556->1|697->47|727->52|799->116|838->118|866->120|2325->1552|2377->1588|2417->1590|2446->1591|2517->1635|2543->1640|2573->1643|2599->1648|2653->1675|2678->1679|2746->1716|2778->1721
                  LINES: 20->1|25->1|28->4|28->4|28->4|30->6|59->35|60->36|60->36|60->36|61->37|61->37|61->37|61->37|62->38|62->38|64->40|65->41
                  -- GENERATED --
              */
          