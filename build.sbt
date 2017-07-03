name := "testing-demo-with-docker"


version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies += "info.cukes" % "cucumber-scala_2.11" % "1.2.5"
libraryDependencies += "info.cukes" % "cucumber-junit" % "1.2.5"
libraryDependencies += "info.cukes" % "cucumber-picocontainer" % "1.2.5"
libraryDependencies += "junit" % "junit" % "4.12" % "test"
libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "2.53.1"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.6"
libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.8"
libraryDependencies += "com.novocode" % "junit-interface" % "0.11"