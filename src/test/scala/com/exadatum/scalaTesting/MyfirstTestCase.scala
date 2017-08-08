package com.exadatum.scalaTesting

import org.scalatest._

class MyFirstTest extends FlatSpec{

  "Addition of 3 and 3" should "have result 6" in {
    assert((3 + 3) == 6)
  }

}

