package extend_the_library

import Implicits._

/**
  * In this example we call a method `headOr`
  * which doesn't exist in the standard library.
  * It is possible because we created our custom
  * extensions and call them with help from
  * `implicit conversions`. Check the
  * `ListExtensions` class and `Implicits` object.
  *
  */


object Example {
  def main(args: Array[String]) {
    println(List(1, 2, 3).headOr(0)) // 1
    println(Nil.headOr(0)) // 0
  }
}
