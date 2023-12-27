# java-course
java full course from begining to advance 

**Basic Java**
- In Java we have to make sure one thing whatever file name we kept in need to put same name for public class for example :
File Name : Main.java 
### Code : 
```
// this is the first program in java 
public class Main {
             ----
  public static void main(String [] args){
    System.out.println("Hello World !");
  };
};

```

- In Above Code we have many keywords we will discuss about all gradually 
- So far we understood in java program we need to write a class with same name whatever name have own file 

##### public static void main
- **public** : is an access modifier in Java, indicating that the method is accessible from anywhere. In the context of the main method, it means that the Java Virtual Machine (JVM) can call this method to start the execution of the Java program.

- **static** :  is a keyword in Java that indicates that the method belongs to the class rather than to instances of the class. In the case of the main method, it's a special method that doesn't require an instance of the class to be created. It's the entry point of a Java program and can be called without creating an object of the class.
Return Type (void), [More](#lets-learn-more-about-static-keyword):

- **void** : is the return type of the main method. It means that the main method does not return any value. The main method is typically used to start the execution of the program rather than to produce a result.
Method Name (main):

- **main** : is the name of the method. In Java, the main method is the starting point for the execution of a Java program. When a Java program is run, the JVM looks for the main method to begin execution.

[Code](#code)

#### Lets learn more about **static** Keyword : 
```
public class ExampleClass {
    
    // The main method is a special method and serves as the entry point of a Java program
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    // Another method in the class
    public void regularMethod() {
        System.out.println("This is a regular method and requires an instance of ExampleClass");
    }
}

```

Static Keyword:

In the main method, the static keyword indicates that this method belongs to the class ExampleClass rather than an instance of the class.
Entry Point of Program:

The main method is the entry point of the Java program. When you run a Java program, the Java Virtual Machine (JVM) looks for the main method and starts executing the code inside it.
Doesn't Require an Instance:

Unlike regular methods (like regularMethod in the example), the main method doesn't require an instance of ExampleClass to be created. You can call the main method without creating an object of ExampleClass.

Example: creating one more class where we ll use **ExampleClass** both method (main ,regularMethod )
- ###### Note : To run the main method, you don't need to create an instance of ExampleClass. Instead, you can directly call it as follows:
```
public class MainClass {
    public static void main(String[] args) {
        ExampleClass.main(args); // Calling the main method without creating an instance
        -----------------------
    }
}

```
- ###### : On the other hand, the regularMethod would need an instance to be called:
```
public class MainClass {
    public static void main(String[] args) {
        ExampleClass exampleInstance = new ExampleClass();
        exampleInstance.regularMethod(); // Calling a regular method with an instance
    }
}
```
- When you use the static keyword before a method in Java, it means that the method belongs to the class itself rather than to instances of the class. This allows you to call the method directly on the class without creating an instance of the class.

```
public class ExampleClass {

    // A static method that can be called without creating an instance
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // A regular (non-static) method
    public void regularMethod() {
        System.out.println("This is a regular method.");
    }

    public static void main(String[] args) {
        // Calling the static method directly on the class
        ExampleClass.staticMethod();

        // Creating an instance of ExampleClass
        ExampleClass instance = new ExampleClass();

        // Calling the regular method using the instance
        instance.regularMethod();
    }
}

```

#### Break Down Code :

**Let's start with a class containing a static method:**

**ExampleClassWithStaticMethod.java**  // file name
```
public class ExampleClassWithStaticMethod {
    public static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
```
**ExampleClassWithRegularMethod.java** // File name
```
public class ExampleClassWithRegularMethod {
    public void regularMethod() {
        System.out.println("This is a regular method.");
    }
}
```


**MainClass.java** // file name
```
public class MainClass {
    public static void main(String[] args) {
        // Calling the static method directly on the class
        ExampleClassWithStaticMethod.staticMethod();

        // Creating an instance of ExampleClassWithRegularMethod
        ExampleClassWithRegularMethod instance = new ExampleClassWithRegularMethod();

        // Calling the regular method using the instance
        instance.regularMethod();
    }
}

```