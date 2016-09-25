package stackable_trait_pattern

/**
  * Base trait in our example
  */

trait IntQueue {
  def get(): Int

  def put(x: Int)
}
