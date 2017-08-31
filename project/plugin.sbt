resolvers += Resolver.url("play-sbt-plugins", url("https://dl.bintray.com/playframework/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

resolvers += Resolver.sonatypeRepo("public")



addSbtPlugin("org.scalaxb" % "sbt-scalaxb" % "1.5.1")