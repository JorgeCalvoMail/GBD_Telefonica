name := "GBD_Telefonica"

version := "1.0"

scalaVersion := "2.10.5"

resolvers += Resolver.url("mvn2", url("http://central.maven.org/maven2/"))

resolvers += Resolver.sonatypeRepo("releases")

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.6.1"

libraryDependencies += "org.apache.spark" % "spark-sql_2.10" % "1.6.1"

libraryDependencies += "org.apache.spark" % "spark-hive_2.10" % "1.6.1"




