
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
                  DATE: Wed Jun 15 02:21:01 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/search.scala.html
                  HASH: 558e25284cfe9db1940d384e65b5dbf08f353896
                  MATRIX: 548->1|685->43|713->45|762->86|801->88|829->90|2097->1332|2123->1349|2162->1350|2194->1355|2316->1450|2342->1455|2398->1481|2431->1487|2600->1629|2614->1634|2627->1638|2674->1647|2715->1660|2764->1682|2792->1689|2821->1690|2858->1700|2886->1707|2915->1708|2945->1711|2973->1718|3002->1719|3032->1722|3060->1729|3121->1759|3153->1764
                  LINES: 20->1|25->1|25->1|25->1|25->1|27->3|55->31|55->31|55->31|56->32|57->33|57->33|59->35|61->37|67->43|67->43|67->43|67->43|68->44|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|69->45|70->46|71->47
                  -- GENERATED --
              */
          