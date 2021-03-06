package tutorial.webapp

import scala.scalajs.js.JSApp
import org.scalajs.dom
import dom.document
import org.scalajs.jquery.jQuery

import scala.scalajs.js.annotation.JSExport

object TutorialApp extends JSApp {
  def appendPar(targetNode: dom.Node, text: String): Unit = {
    jQuery("body").append(s"<p>$text</p>")
  }
  @JSExport
  def _1(): Any = null
  @JSExport
  def _2(): Int = 10
  @JSExport
  def addClickedMessage(): Unit = {
    appendPar(document.body, "You clicked the button!")
  }
  def setupUI(): Unit = {
    jQuery("#click-me-button").click(addClickedMessage _)
    jQuery("body").append("<p>Hello World</p>")
    jQuery("""<button type="button">Click me!</button>""")
      .click(addClickedMessage _)
      .appendTo(jQuery("body"))
  }
  def main(): Unit = {
    jQuery(setupUI _)
  }
}
