seq(githubRepoSettings: _*)

sbtPlugin := true

organization := "com.github.hexx"

name := "sbt-github-repo"

//sbtVersion in Global := "0.13.0" 

//scalaVersion in Global := "2.10.2"

publishMavenStyle := false

version := "0.1.0"

localRepo := Path.userHome / "github" / "maven"

githubRepo := "git@github.com:Fuzion24/maven.git"

resolvers ++= Seq("fuzion24 releases" at "http://fuzion24.github.io/maven/releases")

libraryDependencies <++= (scalaVersion, sbtBinaryVersion) { (scalaV, sbtV) => Seq(
  "com.typesafe.sbt" % "sbt-git" % "0.6.3" extra("scalaVersion" -> scalaV, "sbtVersion" -> sbtV)
)}


