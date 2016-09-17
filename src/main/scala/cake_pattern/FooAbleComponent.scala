package cake_pattern

/**
  * trait FooAbleComponent
  *
  */

trait FooAbleComponent {
  val fooAble: FooAble

  class FooAble {
    def foo() = "here is your foo"
  }

}
