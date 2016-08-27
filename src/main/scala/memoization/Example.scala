package memoization

/**
  * Created by rafaelkyrdan on 8/27/16.
  */
object Example {


  def main(args: Array[String]) {

    // 1 step.
    // this needs to be a function; if it were a method (with def)
    // it would point to rather than evaluate the memo call.
    val g = memo(f)

    // 2 step.
    // during this step f will be called for each argument.
    for (j <- 1 to 3) {
      println(g(j))
    }

    // 3 step.
    // f will no be called by these invocations of g
    for (j <- 1 to 3) {
      println(g(j));
    }
  }

  def memo[X, R](f: X => R): (X) => R = {
    // a WeakHashMap will release cache members if memory tightens
    val cache = new scala.collection.mutable.WeakHashMap[X, R]
    (x: X) => cache.getOrElseUpdate(x, f(x))
  }

  // function to be memorized
  def f(i: Int) = {
    println("called f with " + i)
    i * 2 + 1
  }

}
