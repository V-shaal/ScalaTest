package com.exadatum.scalaTesting.fixtures.fixturecontext

import org.scalatest.FlatSpec

import scala.collection.mutable.ListBuffer

/**
  * Created by tkmafag on 8/6/17.
  */
class FixtureExample extends FlatSpec{

  trait Builder {
    val builder = new StringBuilder("ScalaTest is ")
  }

  trait Buffer {
    val buffer = ListBuffer("ScalaTest", "is")
  }

  // This test needs the StringBuilder fixture
  "Testing" should "be easy" in new Builder {
    builder.append("easy!")
    assert(builder.toString === "ScalaTest is easy!")
  }

  // This test needs the ListBuffer[String] fixture
  "Test code" should "be readable" in new Buffer {
    buffer += "readable!"
    assert(buffer === List("ScalaTest", "is", "readable!"))
  }

  // This test needs both the StringBuilder and ListBuffer
  it should "be clear and concise" in new Builder with Buffer {
    builder.append("clear!")
    buffer += "concise!"
    assert(builder.toString === "ScalaTest is clear!")
    assert(buffer === List("ScalaTest", "is", "concise!"))
  }

}
