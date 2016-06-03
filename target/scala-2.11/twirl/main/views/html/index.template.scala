
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


Seq[Any](format.raw/*1.31*/("""

"""),_display_(/*3.2*/main("Quran N-gram Analytics")/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""

"""),format.raw/*5.1*/("""<div class="jumbotron text-center">
  <div class="container">

    <h1>Quran N-gram Analytics</h1>
    <p>This Scala app lets you perform n-gram Analytics on the English Translation of Quran</p>

      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=10"></span>10-gram</a>
      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=11"></span>11-gram</a>
      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=12"></span>12-gram</a>
      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=13"></span>13-gram</a>
      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=14"></span>14-gram</a>
           <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Dropdown Example
              <span class="caret"></span></button>
          <ul class="dropdown-menu">
              <li><a href="/?numOfWords=15">15-gram</a></li>
              <li><a href="/?numOfWords=16">16-gram</a></li>
              <li><a href="/?numOfWords=17">17-gram</a></li>
              <li><a href="/?numOfWords=18">18-gram</a></li>
          </ul>
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
            """),_display_(/*35.14*/for((ngram, freq) <- ngrams) yield /*35.42*/ {_display_(Seq[Any](format.raw/*35.44*/("""
     """),format.raw/*36.6*/("""<tr><td><a href="search?ngram="""),_display_(/*36.37*/ngram),format.raw/*36.42*/("""">"""),_display_(/*36.45*/ngram),format.raw/*36.50*/("""</a></td><td>"""),_display_(/*36.64*/freq),format.raw/*36.68*/("""</td></tr>
     """)))}),format.raw/*37.7*/("""
  """),format.raw/*38.3*/("""</table>
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
                  DATE: Fri Jun 03 05:04:54 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/index.scala.html
                  HASH: b66605695fafa5cee206c83652a048928cba5b1c
                  MATRIX: 552->1|676->30|704->33|742->63|781->65|809->67|2240->1471|2284->1499|2324->1501|2357->1507|2415->1538|2441->1543|2471->1546|2497->1551|2538->1565|2563->1569|2610->1586|2640->1589
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|59->35|59->35|59->35|60->36|60->36|60->36|60->36|60->36|60->36|60->36|61->37|62->38
                  -- GENERATED --
              */
          