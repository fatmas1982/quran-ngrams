
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

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[List[String]],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(signs: List[List[String]], ngram: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.44*/(""" """),_display_(/*1.46*/main("Quran verses containing: " + ngram)/*1.87*/ {_display_(Seq[Any](format.raw/*1.89*/("""

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
            <td>"""),_display_(/*45.18*/sign(2)),format.raw/*45.25*/("""</td>
            <td>"""),_display_(/*46.18*/sign(0)),format.raw/*46.25*/("""</td>
            <td>"""),_display_(/*47.18*/sign(1)),format.raw/*47.25*/("""</td>
            <td>"""),_display_(/*48.18*/sign(3)),format.raw/*48.25*/("""</td>
            </tr>
            """)))}),format.raw/*50.14*/("""
    """),format.raw/*51.5*/("""</table>
</div>

""")))}))
      }
    }
  }

  def render(signs:List[List[String]],ngram:String): play.twirl.api.HtmlFormat.Appendable = apply(signs,ngram)

  def f:((List[List[String]],String) => play.twirl.api.HtmlFormat.Appendable) = (signs,ngram) => apply(signs,ngram)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Sun Jun 12 12:51:54 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/search.scala.html
                  HASH: 6c1420f9bdf108906c692510a75d10ba50386f0d
                  MATRIX: 548->1|685->43|713->45|762->86|801->88|829->90|2097->1332|2123->1349|2162->1350|2194->1355|2308->1442|2334->1447|2366->1452|2408->1464|2441->1470|2610->1612|2654->1640|2694->1642|2723->1643|2772->1665|2800->1672|2850->1695|2878->1702|2928->1725|2956->1732|3006->1755|3034->1762|3102->1799|3134->1804
                  LINES: 20->1|25->1|25->1|25->1|25->1|27->3|55->31|55->31|55->31|56->32|57->33|57->33|58->34|59->35|61->37|67->43|68->44|68->44|68->44|69->45|69->45|70->46|70->46|71->47|71->47|72->48|72->48|74->50|75->51
                  -- GENERATED --
              */
          