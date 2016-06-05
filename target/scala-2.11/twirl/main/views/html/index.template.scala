
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


      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=10"></span>1 word n-grams</a>
      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=10"></span>10 words n-grams</a>
      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=11"></span>11 words n-grams</a>
      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=12"></span>12 words n-grams</a>
      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=13"></span>13 words n-grams</a>
      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=14"></span>14 words n-grams</a>
      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=15"></span>15 words n-grams</a>
      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=16"></span>16 words n-grams</a>
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
            """),_display_(/*31.14*/for((ngram, freq) <- ngrams) yield /*31.42*/ {_display_(Seq[Any](format.raw/*31.44*/("""
     """),format.raw/*32.6*/("""<tr><td><a href="search?ngram="""),_display_(/*32.37*/ngram),format.raw/*32.42*/("""">"""),_display_(/*32.45*/ngram),format.raw/*32.50*/("""</a></td><td>"""),_display_(/*32.64*/freq),format.raw/*32.68*/("""</td></tr>
     """)))}),format.raw/*33.7*/("""
  """),format.raw/*34.3*/("""</table>
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
                  DATE: Sun Jun 05 05:37:01 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/index.scala.html
                  HASH: c76505553bea14f916a4c03fa31e5220b2ca05c9
                  MATRIX: 552->1|676->30|704->33|742->63|781->65|809->67|2136->1367|2180->1395|2220->1397|2253->1403|2311->1434|2337->1439|2367->1442|2393->1447|2434->1461|2459->1465|2506->1482|2536->1485
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|55->31|55->31|55->31|56->32|56->32|56->32|56->32|56->32|56->32|56->32|57->33|58->34
                  -- GENERATED --
              */
          