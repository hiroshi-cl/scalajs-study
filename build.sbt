import Dependencies._

lazy val root = (project in file(".")).
  enablePlugins(ScalaJSPlugin).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.1",
      scalaJSStage := FullOptStage
    )),
    name := "Scala.js study",
    libraryDependencies += scalaJSDom.value,
    libraryDependencies += scalaJSJQuery.value,
    libraryDependencies += scalaTest % Test,
    skip in packageJSDependencies := false,
    jsDependencies += webJarJQuery.value,
    jsDependencies += RuntimeDOM,
    libraryDependencies += utest.value,
    testFrameworks += utestRunner
  )
