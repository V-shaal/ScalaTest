package com.exadatum.scalaTesting.beforeAndAfter

import scala.collection.mutable.ArrayBuffer

/**
  * Created by tkmafag on 8/6/17.
  */
case class Topping(name: String)

class Pizza {

  private val toppings = new ArrayBuffer[Topping]

  def addTopping (t: Topping) { toppings += t}
  def removeTopping (t: Topping) { toppings -= t}
  def getToppings = toppings.toList

  def boom { throw new Exception("Boom!") }
}