
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>

<head>
    <title>"""),_display_(/*8.13*/title),format.raw/*8.18*/("""</title>
    <link rel="stylesheet" type="text/css" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css" />
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js"></script>
    <script type="text/javascript" src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>


    <script>
        (function(i, s, o, g, r, a, m) """),format.raw/*15.40*/("""{"""),format.raw/*15.41*/("""
            """),format.raw/*16.13*/("""i['GoogleAnalyticsObject'] = r;
            i[r] = i[r] || function() """),format.raw/*17.39*/("""{"""),format.raw/*17.40*/("""
                """),format.raw/*18.17*/("""(i[r].q = i[r].q || []).push(arguments)
            """),format.raw/*19.13*/("""}"""),format.raw/*19.14*/(""", i[r].l = 1 * new Date();
            a = s.createElement(o),
                m = s.getElementsByTagName(o)[0];
            a.async = 1;
            a.src = g;
            m.parentNode.insertBefore(a, m)
        """),format.raw/*25.9*/("""}"""),format.raw/*25.10*/(""")(window, document, 'script', 'https://www.google-analytics.com/analytics.js', 'ga');

        ga('create', 'UA-78811140-1', 'auto');
        ga('send', 'pageview');
    </script>




</head>

<body>
    """),_display_(/*37.6*/content),format.raw/*37.13*/("""
"""),format.raw/*38.1*/("""</body>

</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun Jun 05 17:42:56 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/main.scala.html
                  HASH: 88fa8a9852355596a90328f1f5ab306236aaeaf7
                  MATRIX: 530->1|655->31|683->33|753->77|778->82|1192->468|1221->469|1262->482|1360->552|1389->553|1434->570|1514->622|1543->623|1783->836|1812->837|2043->1042|2071->1049|2099->1050
                  LINES: 20->1|25->1|27->3|32->8|32->8|39->15|39->15|40->16|41->17|41->17|42->18|43->19|43->19|49->25|49->25|61->37|61->37|62->38
                  -- GENERATED --
              */
          