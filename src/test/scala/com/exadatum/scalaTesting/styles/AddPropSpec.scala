package com.exadatum.scalaTesting.styles

import org.scalatest.{Matchers, PropSpec}
import org.scalatest.prop.TableDrivenPropertyChecks


class AddPropSpec extends PropSpec with TableDrivenPropertyChecks with Matchers{
  val examples =
    Table(
      ("a", "b", "result"),
      (3, 3, 6),
      (4, 5, 9)
    )
  property("Addition of two numbers") {
    forAll(examples) {
      (a, b, result) =>
        (a + b) should be (result)
    }
  }

}
