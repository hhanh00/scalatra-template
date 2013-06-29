package com.hanh

import org.scalatra._
import org.scalatra.atmosphere._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.json4s._
import scala.concurrent._
import scala.concurrent.duration._
import ExecutionContext.Implicits.global
import _root_.akka.actor._

class AppServlet extends AppStack {
  get("/index.html") {
    contentType="text/html"
    Ok(jade("hello.jade"))
  }
}
