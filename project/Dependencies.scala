import sbt._
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.0.0"
  lazy val scalaJSDom = Def.setting("org.scala-js" %%% "scalajs-dom" % "0.9.1")
  lazy val jQuery = Def.setting("be.doeraene" %%% "scalajs-jquery" % "0.9.1")
}
