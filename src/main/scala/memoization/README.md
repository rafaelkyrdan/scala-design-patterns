# Memoization

In memoization, the results of a function are memorized - recorded in a Map
with function's argument(s) as key. This saves the computation required 
to execute the original function. 

In our example we use `WeakHashMap` in order implement `Memo`.
The garbage collector does not follow links from the `WeakHashMap` to the keys stored in it. 
This means that a key and its associated value will disappear from the `WeakHashMap` 
if there is no other reference to that key. Also the `WeakHashMap` will 
release cache members if memory tightens. On the first step, we create 
a function which can cache arguments and the result of function applied to 
that argument. On the second step, we apply function to some arguments and 
put them in cache. On the last step, we invoke results from the cache 
instead of calling function, potentially expensive function. Follow the 
comments in the source code.

Note that `Scalaz` supports memoization. Check out the [example](https://github.com/rafaelkyrdan/in-scalaz/blob/master/src/main/scala/31.sc). 