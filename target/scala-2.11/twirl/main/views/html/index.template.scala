
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
        """),_display_(/*32.10*/for((ngram, freq)
        <- ngrams) yield /*33.19*/ {_display_(Seq[Any](format.raw/*33.21*/(""" """),format.raw/*33.22*/("""<tr>
            <td><a href="search?ngram="""),_display_(/*34.40*/ngram),format.raw/*34.45*/("""">"""),_display_(/*34.48*/ngram),format.raw/*34.53*/("""</a></td>
            <td>"""),_display_(/*35.18*/freq),format.raw/*35.22*/("""</td>
            </tr>
            """)))}),format.raw/*37.14*/("""
    """),format.raw/*38.5*/("""</table>
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
                  DATE: Mon Jun 06 00:25:43 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/index.scala.html
                  HASH: 66388f6278749d1fc057ca21e0300698930bfc7c
                  MATRIX: 552->1|676->30|704->32|742->62|781->64|809->66|2188->1418|2240->1454|2280->1456|2309->1457|2380->1501|2406->1506|2436->1509|2462->1514|2516->1541|2541->1545|2609->1582|2641->1587
                  LINES: 20->1|25->1|25->1|25->1|25->1|27->3|56->32|57->33|57->33|57->33|58->34|58->34|58->34|58->34|59->35|59->35|61->37|62->38
                  -- GENERATED --
              */
          