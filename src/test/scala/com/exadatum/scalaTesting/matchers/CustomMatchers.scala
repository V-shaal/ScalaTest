package com.exadatum.scalaTesting.matchers

import org.scalatest.matchers.{MatchResult, Matcher}

/**
  * Created by tkmafag on 8/6/17.
  */
trait CustomMatchers {

  class FileEndsWithExtensionMatcher(expectedExtension: String)
    extends Matcher[java.io.File] {

    def apply(left: java.io.File) = {
      val name = left.getName
      MatchResult(
        name.endsWith(expectedExtension),
        s"""File $name did not end with extension "$expectedExtension"""",
        s"""File $name ended with extension "$expectedExtension""""
      )
    }
  }

  def endWithExtension(expectedExtension: String) = new
      FileEndsWithExtensionMatcher(expectedExtension)
}

object CustomMatchers extends CustomMatchers