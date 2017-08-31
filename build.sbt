name := "scalacasdsl"

version := "11.2.0"

scalaVersion := "2.11.0"

val generated_package_name = "com.endeca.itl.recordstore"

enablePlugins(ScalaxbPlugin)

scalaxbPackageName in (scalaxb)     := "com.endeca.itl.recordstore"


val dispatchVersion = "0.12.0"

scalaxbAsync in ( scalaxb) := true

//sourceGenerators in Compile += scalaxb in Compile
scalaxbDispatchVersion in ( scalaxb) := dispatchVersion

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-xml" % "2.11.0-M4",
  "org.scala-lang" % "scala-parser-combinators" % "2.11.0-M4",
  "net.databinder.dispatch" % "dispatch-core_2.11" % "0.12.0"
)

logLevel in (Compile, scalaxb) := Level.Debug