package structural_type

/**
  * We can compile this example because
  * compiler can guarantee the @type `YourType` has `another` @method.
  */

object Example1 {

  import Structurals._

  def yourMethod(f: YourType) = println(f.another())

  def main(args: Array[String]) {

  }

}
