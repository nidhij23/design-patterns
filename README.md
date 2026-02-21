## Design Patterns
Design patterns are typical solutions to common occuring problems in software design
They are like pre-made blueprints that you can customize to solve a recurring design problem in your code.
A patters consists of the following:
1. Intent of the pattern - it briefly describes both the problem and the solution
2. Motivation - explains the problem and the solution the patterns makes possible
3. Structure - of classes shows each part of the pattern and how they are related.


## Creational Patterns:
These provide object creatin mechanisms that increase flexibility and reuse of existing code.
These are further of 5 types:
1. Factory Method - This is a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses
   to alter the type of objects that will be created.
2. Abstract Factory Method - This is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.
3. Singleton Method - SingleTon is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.
4. Builder Method - This is a creational design pattern that lets you construct complex objects step by step.The pattern allows you to produce different types and representations of an object using the same construction code.
5. Prototype Method - is a creational design pattern that lets you copy existing objects without making your code dependent on their classes.

## Structural Patterns:
explain how to assemble objects and classes into larger structures while keeping these structure flexible and efficient
1. Adapter Pattern- Is a structural design pattern that allows objects with incompatible interfaces to collaborate.
2. Decorator Pattern - is a structural  design pattern that lets you attach new behviors to objects by placing these objets inside special wrapper objects that contain the behaviors.
3. Bridge Pattern - is a structural design pattern that lets you split a large class or a set of closely related classes into 2 separate hierarchies- abstraction and implementation-which can be developed independently of each other.
4. Composite Pattern - is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
5. Facade Pattern - is a structural design pattern that provides a simplified interface to a library, a framework or any other complex set of classes.
6. Flyweight Pattern - is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.
7. Proxy pattern - is a structural pattern  that lets you provide a substitute or placeholder for another object.A proxy controls access to the original oject, allowing you to perform something either before or after the request gets through to the original object.

## Behavioral patterns :
take care of effective communication and the assignment of responsibilities between objects.
1. Chain of responsibility- lets you pass requests along a chain of handlers, upon receiving a request , each handler decides either to process the request or to pass it to the next handler in chain.
2. Command - is a behavioral design pattern that turns a request into a stand alone object that contains all information about the request. This transformation lets you pass requests as a method arguments, delay or queue a request's execution, and support undoable operations.
3. Iterator - lets you traverse elements of a collection without exposing its underlying representation.
4. Mediator - lets you reduce chaotic dependencies between objects. restricts direct communications between objects and forces them to collaborate only via mediator object.
5. Memento - is a behavioral deisgn pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.
6. Observer - lets you define a subscription mehanism to notify multiple objects about any events that happen to the object they're observing.
7. State - lets an object alter its behaviour when its internal state changes. It appears as if the object changed its class.
8. Strategy - lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable.
9. Template Method - defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.
10. Visitor - lets you separate algorithms from the objects on which they operate.

