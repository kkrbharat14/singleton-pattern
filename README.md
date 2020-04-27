# singleton-pattern

Example of Singleton Pattern 

There is a ChocolateBoiler which needs to maintain it's state throughtout App.
It has 3 methods fill,drain and boil.

it can be filled if it is empty
it can be drained if it is not empty and it is boiled.
it can be boiled if it is not empty and not boiled before.

In order for these varaibles/methods to maintain state across all object instantiation 
we need to implement Singleton Pattern.

Pattern has been implemented using 3 ways.

1.Lazily Initialized Singleton.
2.Eagerly Initialized Singleton.
3.Double Checked Locking Singleton.

Note --> 'Example Taken From Book HEAD First Design Pattern'
