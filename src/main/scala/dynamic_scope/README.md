# Dynamic scope

Scala is lexically scoped language, the scope of a variable is determined 
by the nesting of braces in the source code. Dynamic scoping instead makes
variables available based on the nesting of function calls at runtime.
 
Dynamic scoping is generally considered a bad idea, because it breaks 
encapsulation and makes modular type-checking more difficult. However, 
sometimes passing state information between functions can be impractical.
Traditionally global variables have been used for this task but `pure functions` 
can not change global state.

In this example we check approach with implicit parameter.
Follow the comments in the code.
Note, better way is to use a state monad.