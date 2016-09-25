# Stackable Trait Pattern
Scala design pattern in which traits provide stackable modifications to underlying core classes or traits

## Explanation
Threre are 3 roles in this pattern: base, core and stackable.
The `base` trait implement the abstract interface that all other implement.
The `core` class implements abstract methods from `base` and provide core 
functionality. `Stackable` override one or more methods defined in the `base` trait.
The order of mixins is significant. Traits further to the right take effect first(let me put on 
another way - the first trait in the queue of traits works first).
If that method calls super, it invokes the method in the next trait to its left, and so on.

Let's check our examples, where into some classes mixed just one stackable,
other have more than one mixin.

