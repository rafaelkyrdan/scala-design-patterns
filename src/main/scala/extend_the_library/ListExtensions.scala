package extend_the_library

/**
  * Class includes method we want to
  * add to standard library.
  *
  */


class ListExtensions[A](xs: List[A]) {
  def headOr(f: => A): A = xs match {
    case h :: _ => h
    case Nil => f
  }
}