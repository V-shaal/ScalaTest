package com.exadatum.scalaTesting.matchers

import java.io.File


/**
  * Created by tkmafag on 8/6/17.
  */
class PizzaTest extends Unitspec {


  "new pizza" should "have zero topping" in{
    assert(Pizza.getToppings.size === 0)
  }

  //Should equal
  "add Topping" should "add toppings to pizza " in {
    Pizza.addTopping(Topping("Green Olives"))
    Pizza.getToppings.size should equal (1)
  }

  //shouldBe
  "add Topping again " should "add toppings to pizza " in {
    Pizza.addTopping(Topping("Green Olives"))
    val topping = "Green Olives"
    Pizza.getToppings.headOption.get.name shouldBe topping
  }

  //shouldEqual
  "addTopping" should "throw and error when no toppings are added " in{
    try{
      Topping(null)
    }catch {
      case e:IllegalArgumentException =>e.getMessage shouldEqual "requirement failed: No toppings added"
      case _ => fail
    }
  }

  "file without extension as txt" should "throw an error " in {
    new File("lambda") should endWithExtension("txt")
  }
}
