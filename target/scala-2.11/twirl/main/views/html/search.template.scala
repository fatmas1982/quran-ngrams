
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


        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=10"></span>10 words n-grams</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=11"></span>11 words n-grams</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=12"></span>12 words n-grams</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=13"></span>13 words n-grams</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=14"></span>14 words n-grams</a>
    </div>

</div>
<div class="container">

    """),_display_(/*31.6*/if(ngram != null)/*31.23*/{_display_(Seq[Any](format.raw/*31.24*/("""
    """),format.raw/*32.5*/("""<div class="alert alert-success text-center" role="alert">
        Verses containing: """),_display_(/*33.29*/ngram),format.raw/*33.34*/("""
    """),format.raw/*34.5*/("""</div>
    """)))}),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""<table class="table table-hover">
        <thead>
            <tr>
                <th>Verse</th>
            </tr>
        </thead>
        """),_display_(/*43.10*/for((sign)
        <- signs) yield /*44.18*/ {_display_(Seq[Any](format.raw/*44.20*/(""" """),format.raw/*44.21*/("""<tr>
            <td>"""),_display_(/*45.18*/sign),format.raw/*45.22*/("""</td>
            </tr>
            """)))}),format.raw/*47.14*/("""
    """),format.raw/*48.5*/("""</table>
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
                  DATE: Mon Jun 06 04:02:51 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/search.scala.html
                  HASH: eccc5d3a5cb8cc35020d69b51c1c58c8511a5d68
                  MATRIX: 542->1|673->37|701->39|750->80|789->82|817->84|2085->1326|2111->1343|2150->1344|2182->1349|2296->1436|2322->1441|2354->1446|2396->1458|2429->1464|2598->1606|2642->1634|2682->1636|2711->1637|2760->1659|2785->1663|2853->1700|2885->1705
                  LINES: 20->1|25->1|25->1|25->1|25->1|27->3|55->31|55->31|55->31|56->32|57->33|57->33|58->34|59->35|61->37|67->43|68->44|68->44|68->44|69->45|69->45|71->47|72->48
                  -- GENERATED --
              */
          