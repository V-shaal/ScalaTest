package com.exadatum.scalaTesting.assertion

import org.scalatest.FlatSpec

/**
  * Created by tkmafag on 8/6/17.
  */
class PizzaTest extends FlatSpec{

  "new pizza" should "have zero topping" in{
    assert(Pizza.getToppings.size === 0)
  }

  //assert
  "add Topping" should "add toppings to pizza " in {
    Pizza.addTopping(Topping("Green Olives"))
    assert(Pizza.getToppings.size ===1)
  }

  //assert Result
  "add Topping again " should "add toppings to pizza " in {
    Pizza.addTopping(Topping("Green Olives"))
    val topping = "Green Olives"
    assertResult(Pizza.getToppings.headOption.get.name){topping}
  }

  //Try catch
  "addTopping" should "throw and error when no toppings are added " in{
    try{
      Topping(null)
    }catch {
      case e:IllegalArgumentException => assert(e.getMessage == "requirement failed: No toppings added")
      case _ => fail
    }
  }

  // Intercept //withclue
  "addTopping" should "Again throw error when no topping are added" in {
      intercept[IllegalArgumentException] {
        Pizza.boom
      }
  }

  //Fail //
  "Fail addTopping " should "fail when I Deliberately fail it  " in{
    fail("And It failed as Expected")
  }

  //pending
}
