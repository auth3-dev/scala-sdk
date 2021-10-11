name := "admin-sdk"
version := "0.0.1"
scalaVersion := "2.13.6"

libraryDependencies ++= Seq(
    "io.grpc" % "grpc-netty" % "1.41.0",
    "io.grpc" % "grpc-protobuf" % "1.41.0",
    "io.grpc" % "grpc-stub" % "1.41.0",
    "com.thesamet.scalapb" %% "scalapb-runtime" % scalapb.compiler.Version.scalapbVersion,
    "com.thesamet.scalapb" %% "scalapb-runtime-grpc" % scalapb.compiler.Version.scalapbVersion,
)
