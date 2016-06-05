
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[scala.Tuple2[String, Int]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(ngrams: List[(String, Int)]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/(""" """),_display_(/*1.33*/main("Quran N-gram Analytics")/*1.63*/ {_display_(Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*3.1*/("""<div class="jumbotron text-center">
    <div class="container">

        <p class="text-right">
            <a class="github-button" href="https://github.com/saqib-ali/quran-ngrams" data-style="mega" data-count-href="/saqib-ali/quran-ngrams/stargazers" data-count-api="/repos/saqib-ali/quran-ngrams#stargazers_count" data-count-aria-label="# stargazers on GitHub"
            aria-label="Star saqib-ali/quran-ngrams on GitHub">Star</a>
        </p>

        <h1>Quran N-gram Analytics</h1>
        <p>This Scala app lets you perform n-gram Analytics on the English Translation of Quran</p>


        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=1"></span>1 word n-grams</a>
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
        """),_display_(/*33.10*/for((ngram, freq)
        <- ngrams) yield /*34.19*/ {_display_(Seq[Any](format.raw/*34.21*/(""" """),format.raw/*34.22*/("""<tr>
            <td><a href="search?ngram="""),_display_(/*35.40*/ngram),format.raw/*35.45*/("""">"""),_display_(/*35.48*/ngram),format.raw/*35.53*/("""</a></td>
            <td>"""),_display_(/*36.18*/freq),format.raw/*36.22*/("""</td>
            </tr>
            """)))}),format.raw/*38.14*/("""
    """),format.raw/*39.5*/("""</table>
</div>

""")))}))
      }
    }
  }

  def render(ngrams:List[scala.Tuple2[String, Int]]): play.twirl.api.HtmlFormat.Appendable = apply(ngrams)

  def f:((List[scala.Tuple2[String, Int]]) => play.twirl.api.HtmlFormat.Appendable) = (ngrams) => apply(ngrams)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Sun Jun 05 17:58:25 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/index.scala.html
                  HASH: c26b4da67053e43fa546d28db54b53af02ae886c
                  MATRIX: 552->1|676->30|704->32|742->62|781->64|809->66|2292->1522|2344->1558|2384->1560|2413->1561|2484->1605|2510->1610|2540->1613|2566->1618|2620->1645|2645->1649|2713->1686|2745->1691
                  LINES: 20->1|25->1|25->1|25->1|25->1|27->3|57->33|58->34|58->34|58->34|59->35|59->35|59->35|59->35|60->36|60->36|62->38|63->39
                  -- GENERATED --
              */
          