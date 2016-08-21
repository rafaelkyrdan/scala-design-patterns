# Dynamic scope with state monad


Scala is lexically scoped language, the scope of a variable is determined 
by the nesting of braces in the source code. Dynamic scoping instead makes
variables available based on the nesting of function calls at runtime.
Dynamic scoping is generally considered a bad idea, because it breaks 
encapsulation and makes modular type-checking more difficult. However, 
sometimes passing state information between functions can be impractical.

In this example we check approach with state monad. The state monad State[S, A].
Objects of type State hold a single field which is a function that takes an 
object of type S as a parameter and returns a tuple holding an object of 
type S and an object of type A. 

Follow the comments in the code.