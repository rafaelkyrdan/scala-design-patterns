# Cake pattern / Self type annotations / Dependency injection

## What is it for?
Dependency injection, "the scala way".

## Explanation
This patterns based on self type annotations / explicitly type self reference.
This construction looks like `this: AnotherType =>  { // define some methods } ` , `self: AnotherType =>  { // define some methods } `,
you can use `this`, `self` or any identifier for the self type annotation.
It basically means that this class declares that it will eventually extend `AnotherType` somehow.
The self type annotation is just declaring that this type needs to extend / implement the annotated type, 
but it doesn't extend it yet.  It lets you "inject" the extension, many different extensions.

In our example `ExampleCakePattern` we create an instance of `BarUsingFooAble` which
requires 2 components which implement type `FooAbleComponent` and `BazAbleComponent`.
Client can inject(or mix) into it components which has the same type but different implementation.
