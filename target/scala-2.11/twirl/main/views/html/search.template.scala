
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


Seq[Any](format.raw/*1.38*/("""

"""),_display_(/*3.2*/main("Quran verses containing: " + ngram)/*3.43*/ {_display_(Seq[Any](format.raw/*3.45*/("""

"""),format.raw/*5.1*/("""<div class="jumbotron text-center">
    <div class="container">

        <h1>Quran N-gram Analytics</h1>
        <p>This Scala app lets you perform n-gram Analytics on the English Translation of Quran</p>

        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=10"></span>10-gram</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=11"></span>11-gram</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=12"></span>12-gram</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=13"></span>13-gram</a>
        <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=14"></span>14-gram</a>
    </div>

</div>
<div class="container">

    """),_display_(/*21.6*/if(ngram != null)/*21.23*/{_display_(Seq[Any](format.raw/*21.24*/("""
    """),format.raw/*22.5*/("""<div class="alert alert-success text-center" role="alert">
        Verses containing: """),_display_(/*23.29*/ngram),format.raw/*23.34*/("""
    """),format.raw/*24.5*/("""</div>
    """)))}),format.raw/*25.6*/("""

    """),format.raw/*27.5*/("""<table class="table table-hover">
        <thead>
        <tr>
            <th>Verse</th>
        </tr>
        </thead>
        """),_display_(/*33.10*/for((sign) <- signs) yield /*33.30*/ {_display_(Seq[Any](format.raw/*33.32*/("""
        """),format.raw/*34.9*/("""<tr><td>"""),_display_(/*34.18*/sign),format.raw/*34.22*/("""</td></tr>
        """)))}),format.raw/*35.10*/("""
    """),format.raw/*36.5*/("""</table>
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
                  DATE: Fri Jun 03 05:04:54 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/search.scala.html
                  HASH: 04b64adeb9b94b28c63af9902dbdb1f85fea3498
                  MATRIX: 542->1|673->37|701->40|750->81|789->83|817->85|1588->830|1614->847|1653->848|1685->853|1799->940|1825->945|1857->950|1899->962|1932->968|2089->1098|2125->1118|2165->1120|2201->1129|2237->1138|2262->1142|2313->1162|2345->1167
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|45->21|45->21|45->21|46->22|47->23|47->23|48->24|49->25|51->27|57->33|57->33|57->33|58->34|58->34|58->34|59->35|60->36
                  -- GENERATED --
              */
          