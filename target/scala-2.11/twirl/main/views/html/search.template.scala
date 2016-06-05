
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

"""),format.raw/*5.1*/("""<!-- Place this tag where you want the button to render. -->
<div class="jumbotron text-right">
<a class="github-button" href="https://github.com/saqib-ali/quran-ngrams" data-style="mega" data-count-href="/saqib-ali/quran-ngrams/stargazers" data-count-api="/repos/saqib-ali/quran-ngrams#stargazers_count" data-count-aria-label="# stargazers on GitHub" aria-label="Star saqib-ali/quran-ngrams on GitHub">Star</a>
</div>

<div class="jumbotron text-center">
    
    
    
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
        """),_display_(/*43.10*/for((sign) <- signs) yield /*43.30*/ {_display_(Seq[Any](format.raw/*43.32*/("""
        """),format.raw/*44.9*/("""<tr><td>"""),_display_(/*44.18*/sign),format.raw/*44.22*/("""</td></tr>
        """)))}),format.raw/*45.10*/("""
    """),format.raw/*46.5*/("""</table>
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
                  DATE: Sun Jun 05 17:42:56 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/search.scala.html
                  HASH: 5cc0adfa4077137ba10bf5a8059e0ced817e2e64
                  MATRIX: 542->1|673->37|701->40|750->81|789->83|817->85|2166->1408|2192->1425|2231->1426|2263->1431|2377->1518|2403->1523|2435->1528|2477->1540|2510->1546|2667->1676|2703->1696|2743->1698|2779->1707|2815->1716|2840->1720|2891->1740|2923->1745
                  LINES: 20->1|25->1|27->3|27->3|27->3|29->5|55->31|55->31|55->31|56->32|57->33|57->33|58->34|59->35|61->37|67->43|67->43|67->43|68->44|68->44|68->44|69->45|70->46
                  -- GENERATED --
              */
          