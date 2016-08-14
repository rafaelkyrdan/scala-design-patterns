package dynamic_scope

/**
  * Check the output of our example.
  * Method `callMe` prints different values
  * depends on the scope where it is called.
  *
  * How it works? Scala supports passing implicit parameters,
  * the parameter to pass is chosen using the type only, the name is ignored.
  * So that's why we have created a unique 'marker' type for dynamic variable `FooMarker`.
  *
  */

object Example {

  def main(args: Array[String]) {
    test1()
    test2()
  }

  def callMe()(implicit foo: FooMarker) = println(foo.value)

  def test1() = {
    implicit val foo = FooMarker(42)
    callMe()
  }

  def test2() = {
    implicit val foo = FooMarker(24)
    callMe()
  }

}
