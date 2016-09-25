package stackable_trait_pattern

/**
  * Example:
  * - pure
  * - doubling
  *
  */

object Example {

  def main(args: Array[String]): Unit = {

    //pure queue
    val queue = new BasicIntQueue
    queue.put(10)
    println("pure example, get method = " + queue.get())

    // with doubling
    val queueWithDoubling = new BasicIntQueue with Doubling
    queueWithDoubling.put(10)
    println("doubling example, get method = " + queueWithDoubling.get())

    // with incrementing
    val queueWithIncrementing = new BasicIntQueue with Incrementing
    queueWithIncrementing.put(10)
    println("incrementing example, get method = " + queueWithIncrementing.get())

    // with filtering
    val queueWithFiltering = new BasicIntQueue with Filtering
    queueWithFiltering.put(-10)
    queueWithFiltering.put(10)
    println("filtering example, get method = " + queueWithFiltering.get())

    // with filtering and incrementing
    // remember the order of mixins is significant
    val queueWithIncrementingFiltering = new BasicIntQueue with Incrementing with Filtering
    queueWithIncrementingFiltering.put(-1);
    queueWithIncrementingFiltering.put(0);
    queueWithIncrementingFiltering.put(1)

    println("incrementing and filtering example, get method = " + queueWithIncrementingFiltering.get())
    println("incrementing and filtering example, get method = " + queueWithIncrementingFiltering.get())

  }
}


