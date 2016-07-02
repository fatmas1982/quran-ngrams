name := """quran-ngrams"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.10.6"


libraryDependencies ++= Seq(
  cache,
  ws
)

libraryDependencies <+= scalaVersion("org.scala-lang" % "scala-compiler" % _ )
libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.2"
