package stackable_trait_pattern

/**
  * Stackable
  * double all integers that are put in the queue
  * - can only be mixed into class that also extends IntQueue
  * - has a `super` call in the abstract method, it works because
  * `super` calls are dynamically bound
  */

trait Doubling extends IntQueue {
  abstract override def put(x: Int) {
    super.put(2 * x)
  }
}
