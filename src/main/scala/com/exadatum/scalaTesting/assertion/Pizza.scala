package com.exadatum.scalaTesting.assertion

import scala.collection.mutable.ArrayBuffer

/**
  * Created by Vishal on 8/5/17.
  */

case class Topping(name: String){
  require(name!=null,"No toppings added")
}
object Pizza {

  private val toppings = new ArrayBuffer[Topping]

  def addTopping (t: Topping) { toppings += t}
  def removeTopping (t: Topping) { toppings -= t}
  def getToppings = toppings.toList

  def boom { throw new Exception("Boom!") }
}
