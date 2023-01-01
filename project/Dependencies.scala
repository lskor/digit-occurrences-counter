import sbt._

object Dependencies {

  object V {
    val munit= "0.7.29"
  }

  val all = List(
    "org.scalameta" %% "munit" % V.munit % Test,
  )
}