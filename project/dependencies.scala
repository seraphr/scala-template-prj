import sbt._

object Dependencies {
  val scalatestVersion     = "3.1.4"
  val scalatestplusVersion = s"${scalatestVersion}.0"

  object jvm {
    val scalatest  = "org.scalatest"     %% "scalatest"       % scalatestVersion
    val scalacheck = "org.scalatestplus" %% "scalacheck-1-14" % scalatestplusVersion
  }
}
