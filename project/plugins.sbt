logLevel := Level.Warn

resolvers += Resolver.bintrayIvyRepo("s22s", "sbt-plugins")

resolvers += Resolver.typesafeRepo("releases")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.2")

addSbtPlugin("com.github.sbt" % "sbt-ci-release" % "1.5.12")

addSbtPlugin("com.github.sbt" % "sbt-pgp" % "2.2.1")

addSbtPlugin("org.typelevel" % "laika-sbt" % "1.2.0")

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.2.0")
