package cake_pattern

/**
  * trait BazAbleComponent
  *
  */

trait BazAbleComponent {
  val bazAble: BazAble

  class BazAble {
    def baz() = "baz too"
  }

}
