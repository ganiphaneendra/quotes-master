name := "Quotes"

version := "0.1"

scalaVersion := "2.12.0"

resolvers ++= Seq(
  "Typesafe Artifactory Repository" at "http://repo.typesafe.com/typesafe/releases"
)

libraryDependencies ++= Seq(
  "com.typesafe.akka" % "akka-actor" % "2.5.13",
  "com.typesafe.akka" % "akka-testkit" % "2.5.13",
  "org.scalatest" %% "scalatest" % "1.8" % "test"
)
