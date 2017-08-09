package com.exadatum.scalaTesting.styles

import org.scalatest.FunSpec

class AddFunSpec extends FunSpec{

  describe("Addition") {
    describe("of 3 and 3") {
      it("should have result 6") {
        assert((3 + 3) == 6)
      }
    }
  }


}
