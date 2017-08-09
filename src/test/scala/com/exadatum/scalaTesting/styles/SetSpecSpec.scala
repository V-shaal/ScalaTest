package com.exadatum.scalaTesting.styles

//import org.scalatest.Spec
import org.scalatest.Ignore
import org.scalatest.refspec.RefSpec

class SetSpecSpecs extends RefSpec {

  object `A Set` {
    object `when empty` {
      @Ignore def `should have size 0` {
        assert(Set.empty.size === 0)
      }

       def `should produce NoSuchElementException when head is invoked` {
        assertThrows[NoSuchElementException] {
          Set.empty.head
        }
      }
    }
  }
}
