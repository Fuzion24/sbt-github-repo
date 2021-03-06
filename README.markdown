# sbt-github-repo

creates your own Maven repository on Github.

## Installation

Add the following to `project/plugins.sbt`.

    resolvers ++= Seq(
      "fuzion24-releases" at "http://fuzion24.github.io/maven/releases"
    )

    addSbtPlugin("com.github.hexx" % "sbt-github-repo" % "0.1.0")

## Publishing

If you want to create a repository on https://github.com/fuzion24/maven and a local repository on `~/github/repo`,
add the following to `build.sbt`.

    seq(githubRepoSettings: _*)

    localRepo := Path.userHome / "github" / "maven"

    githubRepo := "git@github.com:fuzion24/maven.git"

Run `sbt publish-to-github-repo` to publish your artifacts.

## Resolvers

Users of your artifacts have to add the following to `resolvers`.

    resolvers += "fuzion24-releases" at "http://fuzion24.github.io/maven/releases"
