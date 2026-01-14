## A. Project Overview

• Purpose and description of the Vehicle Management System Vehicle Management System is a system that is developed to depict different vehicles and their drivers.

Thus, the main idea is to utilize this application as an example demonstrating the features of OOP concepts like inheritance, composition, and abstraction.

• Summary of inheritance, composition, and abstraction usage

-**Inheritance**: Instead of defining the same attributes and behaviors in each subclass, the common ones are put into a superclass, thus the subclasses can reuse them.

-**Composition**: Drivers are related to vehicles, so the objects of the two classes can get composed together.

-**Abstraction**: Abstract classes and methods reveal general properties that depend on the specific implementation of the subclasses of different types of vehicles.

---

## B. Class Hierarchy

• Explanation of the superclass and subclasses

-**Superclass**: `Vehicle` is the class that has attributes like `brand`, `year` and methods such as `startEngine()`, `stopEngine()`, `displayInfo()` which are shared by all the subclasses.

-**Subclasses**:

- `Car` - may have additional features like `doors`, `fuelType`.

- `Truck` - may have additions such as `capacity`, `numAxles`.

- `Motorcycle` - only has the addition of whether `hasSidecar` or not.

• Description of overridden methods

Different subclass implementations for the method `startEngine()` are provided by each subclass.

• Explanation of access modifiers used

- Fields that are `private` should only be accessed inside the class where they are declared.

- Fields that are `protected` can be accessed by the subclass that inherits them.

- Methods that are `public` are those that must be accessible to external classes (e.g., `Main`).

---

## C. Instructions to Compile and Run

To compile and run the program:

javac *.java

java Main

## E. Reflection Section

• How inheritance simplified the design

Inheritance gave the different vehicle types a common template based on the Vehicle superclass.

Consequently, it ruled out the need for writing similar code repeatedly, and made the whole system more versatile for the inclusion of other types of vehicles.

• How method overriding helped customize behavior

Car, Truck, and Motorcycle have each redefined using their internal logic the startEngine() method which was originally declared in a superclass.

On one side, this strategy ensures the design to be inline, while on the other, it gives the freedom of the diverse behavioral pattern.

• Challenges faced with access modifiers

On one hand, there was a need to allow subclasses access to certain data by declaring fields as protected, on the other, it was necessary to restrict exposure of too much data at the same time.

Sometimes accessibility by classes located in different packages can be an issue if the default access level is used.

This is where the selection of the modifier comes ​‍​‌‍​‍‌in.






