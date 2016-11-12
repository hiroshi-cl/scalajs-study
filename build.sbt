import Dependencies._

lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.0"
    )),
    name := "Scala.js study",
    libraryDependencies += scalaJSDom.value,
    libraryDependencies += scalaTest % Test
  )
