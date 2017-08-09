package com.exadatum.scalaTesting.beforeAndAfter

import org.scalatest.{BeforeAndAfter, FlatSpec}

import scala.collection.mutable.ListBuffer

/**
  * Created by vishal on 8/6/17.
  */
class ExampleSpec extends FlatSpec with BeforeAndAfter {
  val builder = new StringBuilder
  val buffer = new ListBuffer[String]
  before {
    builder.append("ScalaTest is ")
  }
  after {
    builder.clear()
    buffer.clear()
  }
  "Testing" should "be easy" in {
    builder.append("easy!")
    assert(builder.toString === "ScalaTest is easy!")
    assert(buffer.isEmpty)
    buffer += "sweet"
  }
  it should "be fun" in {
    builder.append("fun!")

    assert(builder.toString === "ScalaTest is fun!")
    assert(buffer.isEmpty)
  }
}