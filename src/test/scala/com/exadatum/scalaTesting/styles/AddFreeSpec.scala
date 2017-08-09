package com.exadatum.scalaTesting.styles

import org.scalatest.FreeSpec

class AddFreeSpec extends FreeSpec{

  "Addition" - {
    "of 3 and 3" - {
      "should have result 6" in {
        assert((3 + 3) == 6)
      }
    }
  }
}
