# Adapter Pattern

**The Adapter Pattern** converts the interface of a class into another interface the clients expect. Adapter lets classes work together that couldn't otherwise because of incompatible interfaces.
There are two (2) kinds:

- object adapters
- class adapters (uses multiple inherentance - not usable in Java)

The only difference is that with a class adapter we subclass the Target and the Adaptee, while with an object adapter we use composition to pass requests to an Adaptee.
