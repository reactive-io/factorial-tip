name := "factorial"

version := "1.0"

scalaVersion := "2.11.0"

val akkaVersion  = "2.3.2"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion
)