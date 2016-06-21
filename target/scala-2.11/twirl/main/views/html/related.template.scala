
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object related_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class related extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[scala.Tuple2[String, List[List[String]]]],Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(repeated: List[(String, List[List[String]])], numOfWords: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.65*/(""" 

"""),_display_(/*3.2*/main("Quran Analysis: " + numOfWords + " word N-grams in Quran")/*3.66*/ {_display_(Seq[Any](format.raw/*3.68*/("""

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
        """),_display_(/*34.10*/for((word, verses) <- repeated) yield /*34.41*/ {_display_(Seq[Any](format.raw/*34.43*/(""" """),format.raw/*34.44*/("""<tr>
            <td>"""),_display_(/*35.18*/word),format.raw/*35.22*/("""</td>
            <td>"""),_display_(/*36.18*/for(List(chapter, versenum, word, versetxt, city) <- verses) yield /*36.78*/ {_display_(Seq[Any](format.raw/*36.80*/(""" """),_display_(/*36.82*/versetxt),format.raw/*36.90*/(""" """),format.raw/*36.91*/("""<strong>("""),_display_(/*36.101*/chapter),format.raw/*36.108*/(""" """),format.raw/*36.109*/(""": """),_display_(/*36.112*/versenum),format.raw/*36.120*/(""" """),format.raw/*36.121*/("""- """),_display_(/*36.124*/city),format.raw/*36.128*/(""")</strong><br/><br/> """)))}),format.raw/*36.150*/("""</td>            </tr>
            """)))}),format.raw/*37.14*/("""
    """),format.raw/*38.5*/("""</table>
</div>

""")))}))
      }
    }
  }

  def render(repeated:List[scala.Tuple2[String, List[List[String]]]],numOfWords:Int): play.twirl.api.HtmlFormat.Appendable = apply(repeated,numOfWords)

  def f:((List[scala.Tuple2[String, List[List[String]]]],Int) => play.twirl.api.HtmlFormat.Appendable) = (repeated,numOfWords) => apply(repeated,numOfWords)

  def ref: this.type = this

}


}

/**/
object related extends related_Scope0.related
              /*
                  -- GENERATED --
                  DATE: Tue Jun 21 02:59:31 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/related.scala.html
                  HASH: 66d305ac6d1c99248b493e9281eb4d651650ff3a
                  MATRIX: 575->1|733->64|762->68|834->132|873->134|901->136|2280->1488|2327->1519|2367->1521|2396->1522|2445->1544|2470->1548|2520->1571|2596->1631|2636->1633|2665->1635|2694->1643|2723->1644|2761->1654|2790->1661|2820->1662|2851->1665|2881->1673|2911->1674|2942->1677|2968->1681|3022->1703|3089->1739|3121->1744
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|58->34|58->34|58->34|58->34|59->35|59->35|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|61->37|62->38
                  -- GENERATED --
              */
          