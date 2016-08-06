package structural_type

/**
  * In this example @method `callSpeak` requires that
  * it's @param `obj` has a `speak` @method.
  * So an instance of any class that has a `speak` with given
  * signature can be passed as parameter to `callSpeak`.
  *
  * The `<:` symbol in the code is used to define an upper bound.
  * `[A <: B]` - means that type A should be a subtype of B
  */

object Example2 {

  def callSpeak[A <: {def speak() : Unit}](obj: A) {
    obj.speak()
  }

  def main(args: Array[String]) {
    callSpeak(new Dog)
    callSpeak(new Cat)
  }

}

class Dog {
  def speak() {
    println("woof")
  }
}

class Cat {
  def speak() {
    println("mew!")
  }
}
