
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
        Verses containing: <strong>"""),_display_(/*33.37*/ngram),format.raw/*33.42*/("""</strong>
    </div>
    """)))}),format.raw/*35.6*/("""

    """),format.raw/*37.5*/("""<table class="table table-hover">
        <thead>
            <tr>
                <th>Verse</th>
            </tr>
        </thead>
        """),_display_(/*43.10*/for((sign)
        <- signs) yield /*44.18*/ {_display_(Seq[Any](format.raw/*44.20*/(""" """),format.raw/*44.21*/("""<tr>
            <td>"""),_display_(/*45.18*/sign(2)/*45.25*/.replaceAll(ngram, "<strong>" + ngram + "</strong>")),format.raw/*45.77*/(""" """),format.raw/*45.78*/("""<strong>("""),_display_(/*45.88*/sign(0)),format.raw/*45.95*/(""" """),format.raw/*45.96*/(""": """),_display_(/*45.99*/sign(1)),format.raw/*45.106*/(""" """),format.raw/*45.107*/("""- """),_display_(/*45.110*/sign(3)),format.raw/*45.117*/(""")</strong> </td>
            """)))}),format.raw/*46.14*/("""
    """),format.raw/*47.5*/("""</table>
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
                  DATE: Mon Jun 13 05:24:39 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/search.scala.html
                  HASH: f31214fe1c8e98cd30bffa108479cffa7c009c27
                  MATRIX: 548->1|685->43|713->45|762->86|801->88|829->90|2097->1332|2123->1349|2162->1350|2194->1355|2316->1450|2342->1455|2398->1481|2431->1487|2600->1629|2644->1657|2684->1659|2713->1660|2762->1682|2778->1689|2851->1741|2880->1742|2917->1752|2945->1759|2974->1760|3004->1763|3033->1770|3063->1771|3094->1774|3123->1781|3184->1811|3216->1816
                  LINES: 20->1|25->1|25->1|25->1|25->1|27->3|55->31|55->31|55->31|56->32|57->33|57->33|59->35|61->37|67->43|68->44|68->44|68->44|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|70->46|71->47
                  -- GENERATED --
              */
          