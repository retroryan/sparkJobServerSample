name := """sparkJobServerSample"""

version := "1.0"

scalaVersion := "2.10.5"
val Spark = "1.2.1"
val SparkCassandra = "1.2.1"

resolvers += "Job Server Bintray" at "https://dl.bintray.com/spark-jobserver/maven"

libraryDependencies ++= Seq(
    "org.apache.spark" % "spark-core_2.10" % Spark % "provided",
    "spark.jobserver" % "job-server-api" % "0.5.0" % "provided",
    "com.datastax.spark" %% "spark-cassandra-connector" % "1.2.1"
)
