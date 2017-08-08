package com.exadatum.scalaTesting.matchers

import org.scalatest._

/**
  * Created by tkmafag on 8/6/17.
  */
abstract class Unitspec extends FlatSpec
                           with Matchers
                           with OptionValues
                           with Inside
                           with Inspectors
                           with CustomMatchers