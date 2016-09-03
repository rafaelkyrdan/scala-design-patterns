# Swiss army knife
The power of traits.

## Discussion
Let's consider the problem. We have a number of requirements:

- Extensibility of existing message bundles
- Flexibility and choice of messages
- Separation of message code from logic
- Easy internationalization and localization
- Ensure we haven't forgotten to write all the necessary messages
- Reuse code where possible


We have a lot of text messages(capabilities) for each we have a trait. 
Each can be used implemented in different ways. For instance, localised.
Now check the `User` object, it's methods only ask for 
(by means of the implicit parameter) the capabilities it needs. 
(The power of implicit params.) Now check the `EnglishMessageBundleExample.scala`
example. It is a example of message bundle. We can combine a lot of 
different message bundle - for different context(User or Account created),
localised on different languages. 

This example demonstrates the power of traits through combining them in 
different way.
