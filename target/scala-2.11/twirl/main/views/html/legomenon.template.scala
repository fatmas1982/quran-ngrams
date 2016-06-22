
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object legomenon_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class legomenon extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[scala.Tuple2[String, List[List[String]]]],Int,play.twirl.api.HtmlFormat.Appendable] {

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

        <h1>Hapax legomenon in Quran</h1>
        <p>This Scala app lets you perform n-gram Analytics on the English Translation of Quran</p>


        <a type="button" class="btn btn-lg btn-default" href="/?legomenon=1"></span>hapax legomenon</a>
        <a type="button" class="btn btn-lg btn-default" href="/?legomenon=2"></span>dis legomenon</a>
        <a type="button" class="btn btn-lg btn-default" href="/?legomenon=3"></span>tris legomenon</a>
        <a type="button" class="btn btn-lg btn-default" href="/?legomenon=4"></span>tetrakis legomenon</a>

    </div>

</div>
<div class="container">
    <table class="table table-hover">
        <thead>
            <tr>
                <th>Legomenon</th>
                <th>Verses</th>
            </tr>
        </thead>
        """),_display_(/*33.10*/for((word, verses) <- repeated) yield /*33.41*/ {_display_(Seq[Any](format.raw/*33.43*/(""" """),format.raw/*33.44*/("""<tr>
            <td>"""),_display_(/*34.18*/word),format.raw/*34.22*/("""</td>
            <td>"""),_display_(/*35.18*/for(List(chapter, versenum, word, versetxt, city) <- verses) yield /*35.78*/ {_display_(Seq[Any](format.raw/*35.80*/(""" """),_display_(/*35.82*/versetxt),format.raw/*35.90*/(""" """),format.raw/*35.91*/("""<strong>("""),_display_(/*35.101*/chapter),format.raw/*35.108*/(""" """),format.raw/*35.109*/(""": """),_display_(/*35.112*/versenum),format.raw/*35.120*/(""" """),format.raw/*35.121*/("""- """),_display_(/*35.124*/city),format.raw/*35.128*/(""")</strong><br/><br/> """)))}),format.raw/*35.150*/("""</td>            </tr>
            """)))}),format.raw/*36.14*/("""
    """),format.raw/*37.5*/("""</table>
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
object legomenon extends legomenon_Scope0.legomenon
              /*
                  -- GENERATED --
                  DATE: Wed Jun 22 06:38:26 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/legomenon.scala.html
                  HASH: 75620afa5877c6f1ac7698253ed433d976fea08f
                  MATRIX: 579->1|737->64|766->68|838->132|877->134|905->136|2168->1372|2215->1403|2255->1405|2284->1406|2333->1428|2358->1432|2408->1455|2484->1515|2524->1517|2553->1519|2582->1527|2611->1528|2649->1538|2678->1545|2708->1546|2739->1549|2769->1557|2799->1558|2830->1561|2856->1565|2910->1587|2977->1623|3009->1628
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|57->33|57->33|57->33|57->33|58->34|58->34|59->35|59->35|59->35|59->35|59->35|59->35|59->35|59->35|59->35|59->35|59->35|59->35|59->35|59->35|59->35|60->36|61->37
                  -- GENERATED --
              */
          