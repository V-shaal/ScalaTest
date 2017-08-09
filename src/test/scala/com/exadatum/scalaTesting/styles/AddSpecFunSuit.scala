package com.exadatum.scalaTesting.styles

import org.scalatest.{FlatSpec, FunSuite, Matchers}


class AddSpecFunSuit extends FunSuite with Matchers{

  test("3 plus 3 is 6") {
    assert((3 + 3) == 6)
  }
}
