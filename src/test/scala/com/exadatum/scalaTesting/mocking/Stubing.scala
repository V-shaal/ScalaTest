package com.exadatum.scalaTesting.mocking

import java.util.Date

import org.scalatest._
import org.scalatest.mockito.MockitoSugar
import org.mockito.Mockito._


/**
  * Created by tkmafag on 8/6/17.
  */
trait DumbFormatter {

  def formatWithDataTimePrefix(inputString : String, date : Date) : String = {
    s"date : $date : $inputString"
  }

  def getDate() : String = {
    new Date().toString
  }
}

class Stubing extends FlatSpec with Matchers with MockitoSugar{

  "Stubbing using Mockito " should "be easy" in {

    var mockDumbFormatter = mock[DumbFormatter]
    when(mockDumbFormatter.getDate()).thenReturn("07/07/2017")
    assert("07/07/2017" === mockDumbFormatter.getDate())
  }
}
// try for formatWithDataTimePrefix yourself
