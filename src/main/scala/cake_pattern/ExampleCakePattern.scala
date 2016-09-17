package cake_pattern

/**
  * In this example we create an instance of `BarUsingFooAble`
  * and injected 2 traits, which can have multiple implementations.
  *
  */

object ExampleCakePattern {
  def main(args: Array[String]): Unit = {

    val barWithFoo = new BarUsingFooAble with FooAbleComponent with BazAbleComponent {
      //or any other implementation
      val bazAble = new BazAble()
      //or any other implementation
      val fooAble = new FooAble()
    }
    println(barWithFoo.bar())

  }
}
