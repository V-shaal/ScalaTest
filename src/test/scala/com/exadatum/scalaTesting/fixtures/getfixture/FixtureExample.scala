package com.exadatum.scalaTesting.fixtures.getfixture

import org.scalatest.FlatSpec

import scala.collection.mutable.ListBuffer

/**
  * Created by tkmafag on 8/6/17.
  */
class  FixtureExample  extends FlatSpec{

  def fixture = new {
    val builder = new StringBuilder("Fixtures makes ScalaTest ")
    val buffer = new ListBuffer[String]
  }

  "Fixtures" should "be easy" in {
    val f = fixture
    f.builder.append("easy !")
    assert(f.builder.toString === "Fixtures makes ScalaTest easy !")
    assert(f.buffer.isEmpty)
    f.buffer += "sweet"
  }

  it should "be fun" in {
    val f = fixture
    f.builder.append("fun!")
    assert(f.builder.toString === "Fixtures makes ScalaTest fun!")
  }
}
