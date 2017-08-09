package com.exadatum.scalaTesting.styles

import org.scalatest.WordSpec


class AddWordSec extends WordSpec{
  "Addition" when {
    "of 3 and 3" should {
      "have result 6" in {
        assert((3 + 3) == 6)
      }
    }
  }
}
