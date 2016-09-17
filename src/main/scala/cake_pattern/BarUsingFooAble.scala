package cake_pattern

/**
  * class BarUsingFooAble uses self type annotations,
  * when we create an instance of this class, it requires 2 components with
  * specified types.
  *
  */

class BarUsingFooAble {
  this: FooAbleComponent with BazAbleComponent =>
  def bar() = s"bar calls foo:\n${fooAble.foo()}\nand baz:\n${bazAble.baz()}"
}
