# Assignment-2-Object-Oriented-Programming-Inheritance-and-Abstraction-
# Vehicle Management System

## A. Project Overview
• Purpose and description of the Vehicle Management System  
The Vehicle Management System is designed to model and manage different types of vehicles and their drivers.  
Its purpose is to demonstrate object-oriented programming principles such as inheritance, composition, and abstraction in a practical application.

• Summary of inheritance, composition, and abstraction usage  
- **Inheritance**: Common attributes and behaviors are defined in a superclass and reused by subclasses.  
- **Composition**: Vehicles are associated with drivers, showing how objects can be composed together.  
- **Abstraction**: Abstract classes and methods define general behaviors that are implemented differently by specific vehicle types.

---

## B. Class Hierarchy
• Explanation of the superclass and subclasses  
- **Superclass**: `Vehicle` contains shared attributes such as `brand`, `year`, and methods like `startEngine()`, `stopEngine()`, `displayInfo()`.  
- **Subclasses**:  
  - `Car` — adds attributes like `doors`, `fuelType`.  
  - `Truck` — adds attributes like `capacity`, `numAxles`.  
  - `Motorcycle` — adds attribute `hasSidecar`.

• Description of overridden methods  
Each subclass overrides `startEngine()` to provide vehicle‑specific behavior.

• Explanation of access modifiers used  
- `private` for sensitive fields.  
- `protected` for attributes that subclasses need to access.  
- `public` for methods that external classes (like `Main`) must call.

---

## C. Instructions to Compile and Run
To compile and run the program: 

```bash
javac *.java
java Main

## E. Reflection Section
• How inheritance simplified the design
Inheritance allowed all vehicle types to share a common structure defined in the superclass Vehicle.
This eliminated code duplication and made the system easier to extend when adding new vehicle types.
• How method overriding helped customize behavior
Each subclass (Car, Truck, Motorcycle) overrode methods such as startEngine() to provide vehicle‑specific logic.
This ensured consistent design while allowing flexibility for unique behaviors.
• Challenges faced with access modifiers
Using protected fields enabled subclasses to access necessary data, but required careful control to avoid exposing too much.
Default access sometimes caused confusion when classes in different packages needed visibility, highlighting the importance of deliberate modifier choice


```bash
javac *.java
java Main
