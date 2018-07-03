import android.Keys._

lazy val root = (project in file(".")).settings(android.Plugin.androidBuild)
  .settings(
    name := "Android-Test",
    scalaVersion := "2.12.6",
    versionCode := Some(0),
    versionName := Some("0.1")
  )
