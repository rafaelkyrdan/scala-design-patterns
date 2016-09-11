# How to extend the library

This pattern shows how to extend library without modifying it.
In our example we will extend the `List`. The goal is to add
`headOr` method. First step, we create class `ListExtensions` with
methods we want to add to standard library. In the object `Implicits`
we define implicit conversions.
Now we can run our `Example` - we call method on `List` which doesn't
exist in the standard library.