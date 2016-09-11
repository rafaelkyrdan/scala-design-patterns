package extend_the_library

import scala.language.implicitConversions

/**
  * In this object we define an implicit conversion,
  * you can't define an implicit conversion with global scope
  *
  */


object Implicits {
  implicit def listExtensions[A](xs: List[A]): ListExtensions[A] = new ListExtensions(xs)
}
