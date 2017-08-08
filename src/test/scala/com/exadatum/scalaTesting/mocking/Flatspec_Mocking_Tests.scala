package com.exadatum.scalaTesting.mocking

import org.scalatest.{FlatSpec, Matchers}
import org.mockito.Mockito._
import org.scalatest.mockito.MockitoSugar

/**
  * Created by tkmafag on 8/6/17.
  */
class Flatspec_Mocking_Tests extends FlatSpec with Matchers with MockitoSugar{

  "Testing using Mockito " should "be easy" in {

    //mock creation
    val mockedList = mock[java.util.ArrayList[String]]

    //using mock object
    mockedList.add("one");
    mockedList.clear

    //verification
    verify(mockedList).add("one")
    verify(mockedList).clear

  }

}
