package dynamic_scope_with_state_monad

import scalaz._
import Scalaz._

/**
  * It is an example of dynamic scope with `state monad`
  * from the scalaz library.
  *
  * Check the output of our example. Method `callMe` prints different values
  * depends on the scope where it is called.
  *
  * The state monad State[S, A]
  * Objects of type State hold a single field which is a function that
  * takes an object of type S as a parameter and returns a tuple
  * holding an object of type S and an object of type A.
  */

object Example {

  def callMe(): State[Int, Unit] = State { x: Int => (x, println(x)) }

  def main(args: Array[String]) {

    test1()
    test2()
  }

  def test1() = {

    callMe().run(42)
  }

  def test2() = {

    callMe().run(24)
  }
}
