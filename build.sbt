name := """quran-ngrams"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.8"


libraryDependencies ++= Seq(
  cache,
  ws
)

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _ )
libraryDependencies += guice