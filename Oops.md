
[Abstraction](#1-what-is-abstraction)  
[Abstract Class](#1-basic-example-of-abstraction-with-an-abstract-class)  
[Inteface](#2-this-guide-focuses-on-interfaces-to-achieve-abstraction)  
[Why Abstarction](#why-do-we-need-abstraction)  
[Why Interface](#why-we-need-interface-in-java)  


[first Code](#code)  

# Understanding Abstraction in Java with Interfaces

## 1. What is Abstraction?

**Abstraction** in Java is a way to simplify complex systems by focusing only on the **essential details** of an object and **hiding the implementation**. It allows you to define what an object does but not how it does it. This concept is central to **Object-Oriented Programming (OOP)**.

### Why do we need Abstraction?
- **Simplification**: It hides the unnecessary details, allowing you to focus on what’s important.
- **Reusability**: Makes code reusable by separating behavior from implementation.
- **Maintainability**: Easy to change the implementation without affecting other parts of the code.

---

## 2. How to Achieve Abstraction in Java?

Abstraction can be achieved in two main ways in Java:
- **Abstract Classes**: These provide partial abstraction (some methods can have implementation).
- **Interfaces**: These provide full abstraction (only method signatures, no implementation).

### 1. Basic Example of Abstraction with an Abstract Class:
```java
// Abstract class
abstract class Animal {
    // Abstract method (without implementation)
    public abstract void sound();

    // Regular method (with implementation)
    public void sleep() {
        System.out.println("This animal is sleeping");
    }
}

// Subclass inherits from Animal
class Dog extends Animal {
    // Provide implementation for abstract method
    public void sound() {
        System.out.println("The dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog(); // Create a Dog object
        myDog.sound();            // Call the abstract method
        myDog.sleep();            // Call the regular method
    }
}

```
**Explanation** 
- Animal is an abstract class, which means you can't create an object of it directly.
- It has an abstract method sound() which must be implemented in subclasses like Dog.
- The method sleep() has a default implementation in the abstract class, and can be used by any subclass.

### 2. Advanced Example: Multiple Abstract Methods and Concrete Methods
```java
// Abstract class
abstract class Shape {
    // Abstract method to calculate area
    public abstract double area();

    // Abstract method to calculate perimeter
    public abstract double perimeter();

    // Concrete method
    public void display() {
        System.out.println("This is a shape.");
    }
}

// Subclass for Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Subclass for Rectangle
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        
        Shape rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
    }
}
```
**Explanation** 
- The Shape abstract class defines two abstract methods: area() and perimeter().
- Circle and Rectangle classes extend Shape and provide their own implementations for these methods.
- The concrete method display() could be called to output common behavior for all shapes.


### 3. More Advanced Concepts: Abstract Classes with Constructors and Field

```java
abstract class Vehicle {
    protected String brand;

    // Constructor
    public Vehicle(String brand) {
        this.brand = brand;
    }

    // Abstract method
    public abstract void start();

    // Concrete method
    public void showBrand() {
        System.out.println("Vehicle Brand: " + brand);
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand); // Call the constructor of the abstract class
    }

    @Override
    public void start() {
        System.out.println(brand + " car is starting.");
    }
}

public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car("Toyota");
        myCar.showBrand();  // Display the brand of the car
        myCar.start();      // Start the car
    }
}

```
**Explanation**:
- The abstract class Vehicle has a constructor to initialize the brand field.
- The subclass Car calls the parent class constructor using super() to set the brand, and provides its own implementation for start().


### 2. This guide focuses on **interfaces** to achieve abstraction.
---

## 3. Basic Example: Abstraction Using Interfaces

### Step 1: Define an Interface

An **interface** is a blueprint that defines the behavior (methods) but leaves the actual implementation to the classes.

Here is an example of a simple `Animal` interface with an abstract method `sound()`:

```java
public interface Animal {
    void sound(); // Abstract method, no implementation
}
```

#### Step 2: Implement the Interface in a Class
Next, we create a Dog class that implements the Animal interface. This class will provide the actual implementation of the sound() method.

```java
public class Dog implements Animal {
    @Override
    public void sound() {
        System.out.println("Woof");
    }
}
```

#### Step 3: Use the Interface in the Main Program
Finally, you use the interface in the main program. Notice that we can refer to the Dog object as an Animal because Dog implements the Animal interface. This is an example of polymorphism.

```java
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();  // Polymorphism: Dog is treated as an Animal
        myDog.sound();  // Outputs: Woof
    }
}
```

#### 4. Advanced Usage: Multiple Implementations of an Interface
You can have multiple classes implementing the same interface, each providing its own behavior.

#### Step 4: Adding More Classes
Here’s how you can add more animals like Cat and Cow by implementing the same Animal interface:

```java
public class Cat implements Animal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Cow implements Animal {
    @Override
    public void sound() {
        System.out.println("Moo");
    }
}
```

##### Step 5: Using Multiple Implementations
Now, the main program can use different implementations of the Animal interface, allowing for flexibility and reusability:

```java
public class Main {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();  // Outputs: Woof

        Animal myCat = new Cat();
        myCat.sound();  // Outputs: Meow

        Animal myCow = new Cow();
        myCow.sound();  // Outputs: Moo
    }
}
```
## Lambda Expressions with Functional Interfaces (Advanced)
A lambda expression can be used with interfaces that have only one abstract method (called functional interfaces). This simplifies the code.

#### Step 6: Using Lambda Expressions
Instead of creating entire classes, we can use lambda expressions to implement the Animal interface in a simpler way.

```java

public class Main {
    public static void main(String[] args) {
        // Lambda expression for Dog
        Animal dog = () -> System.out.println("Woof");
        dog.sound();  // Outputs: Woof

        // Lambda expression for Cat
        Animal cat = () -> System.out.println("Meow");
        cat.sound();  // Outputs: Meow
    }
}
```

##### 6. Advanced Features: Default and Static Methods in Interfaces (Java 8+)
##### In Java 8 and later, interfaces can have default and static methods.

Default methods: These provide a default implementation that can be used by any class implementing the interface.
Static methods: These belong to the interface itself and can be called without an object instance.
Here’s how to use them:

```java
public interface Animal {
    void sound();  // Abstract method

    // Default method with implementation
    default void eat() {
        System.out.println("Animal is eating");
    }

    // Static method
    static void sleep() {
        System.out.println("Animal is sleeping");
    }
}
```

###### Step 7: Using Default and Static Methods

```java
public class Main {
    public static void main(String[] args) {
        Animal dog = () -> System.out.println("Woof");
        dog.sound();  // Outputs: Woof
        dog.eat();    // Outputs: Animal is eating

        Animal.sleep();  // Outputs: Animal is sleeping
    }
}
```

### . Summary
Abstraction is a way to hide details and show only the essential features of an object.
Interfaces in Java provide 100% abstraction by only defining method signatures, leaving the implementation to the classes.
Lambda expressions allow you to implement functional interfaces in a more concise way.
Default and Static methods allow more flexibility in interfaces without breaking existing code.

## why we need interface in java 
- 1. it is used to achieve abstraction
- 2. it is used to achieve multiple inheritance
- 3. it is used to achieve loose coupling
- 4. it is used to achieve dependency inversion
- 5. it is used to achieve polymorphism
- 6. it is used to achieve encapsulation
- 7. it is used to achieve code reusability
- 8. it is used to achieve code extensibility
- 9. it is used to achieve code maintainability
- 10. it is used to achieve code readability
- 11. it is used to achieve code documentation
- 12. it is used to achieve code testing
- 13. it is used to achieve code debugging
- 14. it is used to achieve code optimization
- 15. it is used to achieve code security
- 16. it is used to achieve code portability
- 17. it is used to achieve code scalability
- 18. it is used to achieve code flexibility
- 19. it is used to achieve code modularity
- 20. it is used to achieve code abstraction