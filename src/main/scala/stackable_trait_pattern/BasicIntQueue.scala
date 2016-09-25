package stackable_trait_pattern

import scala.collection.mutable.ArrayBuffer

/**
  * Core in our example
  *
  */

class BasicIntQueue extends IntQueue {
  private val buf = new ArrayBuffer[Int]

  def get() = buf.remove(0)

  def put(x: Int) {
    buf += x
  }
}
