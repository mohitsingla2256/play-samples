val akkaVersion = "2.6.0-M3"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """play-chatroom-scala-example""",
    version := "2.8.x",
    scalaVersion := "2.13.0",
    libraryDependencies ++= Seq(
      guice,
      "org.webjars" %% "webjars-play" % "2.7.3",
      "org.webjars" % "flot" % "0.8.3-1",
      "org.webjars" % "bootstrap" % "3.3.6",
      "net.logstash.logback" % "logstash-logback-encoder" % "5.2",
      "org.jsoup" % "jsoup" % "1.11.3",
      "ch.qos.logback" % "logback-classic" % "1.2.3",
      "com.typesafe.akka" %% "akka-slf4j" % akkaVersion,
      "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
      "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0-M2" % Test
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
