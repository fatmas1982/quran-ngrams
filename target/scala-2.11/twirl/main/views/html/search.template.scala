
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[String],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signs: List[String], ngram: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/(""" """),_display_(/*1.40*/main("Quran verses containing: " + ngram)/*1.81*/ {_display_(Seq[Any](format.raw/*1.83*/("""

"""),format.raw/*3.1*/("""<!-- Place this tag where you want the button to render. -->

<div class="jumbotron text-center">



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

    """),_display_(/*32.6*/if(ngram != null)/*32.23*/{_display_(Seq[Any](format.raw/*32.24*/("""
    """),format.raw/*33.5*/("""<div class="alert alert-success text-center" role="alert">
        Verses containing: """),_display_(/*34.29*/ngram),format.raw/*34.34*/("""
    """),format.raw/*35.5*/("""</div>
    """)))}),format.raw/*36.6*/("""

    """),format.raw/*38.5*/("""<table class="table table-hover">
        <thead>
            <tr>
                <th>Verse</th>
            </tr>
        </thead>
        """),_display_(/*44.10*/for((sign)
        <- signs) yield /*45.18*/ {_display_(Seq[Any](format.raw/*45.20*/(""" """),format.raw/*45.21*/("""<tr>
            <td>"""),_display_(/*46.18*/sign),format.raw/*46.22*/("""</td>
            </tr>
            """)))}),format.raw/*48.14*/("""
    """),format.raw/*49.5*/("""</table>
</div>

""")))}))
      }
    }
  }

  def render(signs:List[String],ngram:String): play.twirl.api.HtmlFormat.Appendable = apply(signs,ngram)

  def f:((List[String],String) => play.twirl.api.HtmlFormat.Appendable) = (signs,ngram) => apply(signs,ngram)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Sun Jun 05 17:51:15 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/search.scala.html
                  HASH: 0fcf0176a603029eb1a20afa4129074eb61bc3b9
                  MATRIX: 542->1|673->37|701->39|750->80|789->82|817->84|2189->1430|2215->1447|2254->1448|2286->1453|2400->1540|2426->1545|2458->1550|2500->1562|2533->1568|2702->1710|2746->1738|2786->1740|2815->1741|2864->1763|2889->1767|2957->1804|2989->1809
                  LINES: 20->1|25->1|25->1|25->1|25->1|27->3|56->32|56->32|56->32|57->33|58->34|58->34|59->35|60->36|62->38|68->44|69->45|69->45|69->45|70->46|70->46|72->48|73->49
                  -- GENERATED --
              */
          