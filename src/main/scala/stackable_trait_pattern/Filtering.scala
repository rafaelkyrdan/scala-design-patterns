package stackable_trait_pattern

/**
  * Stackable
  * filter out negative integers from a queue
  * - can only be mixed into class that also extends IntQueue
  * - has a `super` call in the abstract method, it works because
  * `super` calls are dynamically bound
  */

trait Filtering extends IntQueue {
  abstract override def put(x: Int) {
    if (x >= 0) super.put(x)
  }
}