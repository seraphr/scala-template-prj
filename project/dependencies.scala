import sbt._

object Dependencies {
  val scalatestVersion     = "3.2.17"
  val scalatestplusVersion = s"${scalatestVersion}.0"

  object jvm {
    val scalatest  = "org.scalatest"     %% "scalatest"       % scalatestVersion
    val scalacheck = "org.scalatestplus" %% "scalacheck-1-17" % scalatestplusVersion
  }
}
