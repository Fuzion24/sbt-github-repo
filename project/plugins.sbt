resolvers ++= Seq("jgit-repo" at "http://download.eclipse.org/jgit/maven", "Fuzion24 Releases" at "http://fuzion24.github.io/maven/releases")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.6.2")

addSbtPlugin("com.github.hexx" % "sbt-github-repo" % "0.1.0")
