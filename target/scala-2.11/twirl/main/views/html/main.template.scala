
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

    <script async defer src="https://buttons.github.io/buttons.js"></script>
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
                  DATE: Wed Jun 15 00:44:23 UTC 2016
                  SOURCE: /home/ubuntu/workspace/app/views/main.scala.html
                  HASH: 6db77523a74f0b50d7055396181b43f00c552100
                  MATRIX: 530->1|655->31|683->33|753->77|778->82|1268->544|1297->545|1338->558|1436->628|1465->629|1510->646|1590->698|1619->699|1859->912|1888->913|2119->1118|2147->1125|2175->1126
                  LINES: 20->1|25->1|27->3|32->8|32->8|39->15|39->15|40->16|41->17|41->17|42->18|43->19|43->19|49->25|49->25|61->37|61->37|62->38
                  -- GENERATED --
              */
          