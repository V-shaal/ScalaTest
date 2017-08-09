package com.exadatum.scalaTesting.styles

import org.scalatest.{FeatureSpec, GivenWhenThen}

/**
  * Created by tkmafag on 8/9/17.
  */
class Calculator {
  def add(a: Int, b: Int): Int = a + b

}
class CalcSpec extends FeatureSpec with GivenWhenThen {
  info("As a calculator owner")
  info("I want to be able add two numbers")
  info("so I can get a correct result")
  feature("Addition") {
    scenario("User adds two numbers") {
      Given("a calculator")
      val calc = new Calculator
      When("two numbers are added")
      var result = calc.add(3, 3)
      Then("we get correct result")
      assert(result == 6)
    }
  }
}
