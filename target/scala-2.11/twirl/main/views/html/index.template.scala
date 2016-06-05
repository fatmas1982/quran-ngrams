
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


      <a type="button" class="btn btn-lg btn-default" href="/?numOfWords=1"></span>1 word n-grams</a>
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
            """),_display_(/*30.14*/for((ngram, freq) <- ngrams) yield /*30.42*/ {_display_(Seq[Any](format.raw/*30.44*/("""
     """),format.raw/*31.6*/("""<tr><td><a href="search?ngram="""),_display_(/*31.37*/ngram),format.raw/*31.42*/("""">"""),_display_(/*31.45*/ngram),format.raw/*31.50*/("""</a></td><td>"""),_display_(/*31.64*/freq),format.raw/*31.68*/("""</td></tr>
     """)))}),format.raw/*32.7*/("""
  """),format.raw/*33.3*/("""</table>
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
                  DATE: Sun Jun 05 05:39:15 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/index.scala.html
                  HASH: 38bcac86286a9d402b9196623840bc13a0091d4a
                  MATRIX: 552->1|676->30|704->33|742->63|781->65|809->67|1929->1160|1973->1188|2013->1190|2046->1196|2104->1227|2130->1232|2160->1235|2186->1240|2227->1254|2252->1258|2299->1275|2329->1278
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|54->30|54->30|54->30|55->31|55->31|55->31|55->31|55->31|55->31|55->31|56->32|57->33
                  -- GENERATED --
              */
          