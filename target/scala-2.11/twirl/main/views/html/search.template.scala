
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

        <a type="button" class="btn btn-lg btn-default" href="/"></span>10 words n-grams</a>
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
        """),_display_(/*43.10*/signs/*43.15*/.map/*43.19*/ {sign =>_display_(Seq[Any](format.raw/*43.28*/("""
            """),format.raw/*44.13*/("""<tr>
            <td>"""),_display_(/*45.18*/sign(2)),format.raw/*45.25*/(""" """),format.raw/*45.26*/("""<strong>("""),_display_(/*45.36*/sign(0)),format.raw/*45.43*/(""" """),format.raw/*45.44*/(""": """),_display_(/*45.47*/sign(1)),format.raw/*45.54*/(""" """),format.raw/*45.55*/("""- """),_display_(/*45.58*/sign(3)),format.raw/*45.65*/(""")</strong> </td>
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
                  DATE: Sun Jun 26 23:53:42 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/search.scala.html
                  HASH: e2400a996312c81d2bbc80ecdb9cbc2e2411d704
                  MATRIX: 548->1|685->43|713->45|762->86|801->88|829->90|2189->1424|2215->1441|2254->1442|2286->1447|2408->1542|2434->1547|2490->1573|2523->1579|2692->1721|2706->1726|2719->1730|2766->1739|2807->1752|2856->1774|2884->1781|2913->1782|2950->1792|2978->1799|3007->1800|3037->1803|3065->1810|3094->1811|3124->1814|3152->1821|3213->1851|3245->1856
                  LINES: 20->1|25->1|25->1|25->1|25->1|27->3|55->31|55->31|55->31|56->32|57->33|57->33|59->35|61->37|67->43|67->43|67->43|67->43|68->44|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|70->46|71->47
                  -- GENERATED --
              */
          