lazy val root = project
  .in(file("."))
  .settings(
    name         := "DataV",
    organization := "visionofsid",
    scalaVersion := "2.12.12",
    version      := "0.1.0-SNAPSHOT",
    libraryDependencies += "org.apache.flink" % "flink-clients" % "1.16.0",
    libraryDependencies += "org.apache.flink" %% "flink-connector-cassandra" % "1.16.0", 
    libraryDependencies += "org.apache.flink" %% "flink-streaming-scala" % "1.16.0",
    libraryDependencies += "org.apache.flink" % "flink-connector-kafka" % "1.16.0",
    libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "4.0.0",
    libraryDependencies += "com.datastax.oss" % "native-protocol" % "1.5.1" 

  )
