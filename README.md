# java-course
java full course from begining to advance
 
[Basic](#java-course)  
[first Code](#code)  
[public static void main explaination](#public-static-void-main)  
[Datatypes](#datatypes)  
[Conversiion](#conversiion)  
[Operators](#Operators)  
[if else Conditions ](#if-else-statements)  
[Switch Statements](#switch-statements)  
[Loops](#loops)  
[Whileloop](#while-loop)  
[Do While Loop](#do-while-loop)  
[For Loop](#for-loop)  
[Foreach Loop](#for-each-loop)  





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

### Datatypes 
/**
 * ## Data Types in Java
 *
 * In this file, we will explore various types of data types in Java, including:
 *
 * - Primitive Types: Byte, short, int, long, double, float, boolean,char
 * - Non-primitive Types: String, Array, Class
 *
 * ## Examples of Primitive Data Types
 *
 * ### Byte:
 * - Range: -128 to 127
 *
 * ### Short:
 * - Range: -32,768 to 32,767
 *
 * ### Int:
 * - Range: -2,147,483,648 to 2,147,483,647
 *
 * ### Long:
 * - Range: -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
 *
 * ### Float:
 * - Range: Approximately ±3.40282347E+38F (6-7 significant decimal digits)
 *
 * ### Double:
 * - Range: Approximately ±1.79769313486231570E+308 (15 significant decimal digits)
 */

```
public class Datatypes {
    public static void main(String a[]) {
        // Byte with a range of numbers from -128 to 127
        // byte num1 = -128;
        // System.out.println("Byte minimum value: " + num1);
        // num1 = 127;
        // System.out.println("Byte maximum value: " + num1);

        // Short with a range of numbers from -32768 to 32767
        // short num2 = -32768;
        // System.out.println("Short minimum value: " + num2);
        // num2 = 32767;
        // System.out.println("Short maximum value: " + num2);

        // Int with a range of numbers from -2,147,483,648 to 2,147,483,647
        // int num3 = -2_147_483_648;
        // System.out.println("Int minimum value: " + num3);
        // num3 = 2_147_483_647;
        // System.out.println("Int maximum value: " + num3);
    }
}
```
### Conversiion 
/**
 * Two type of Conversion in Java we have 
 1: Widening Conversion: : (Automatic) less to more because we don't any faer to loose to data. 
@example 
    {
        int intValue = 10;
        long longValue = intValue; // Implicit conversion (int to long)
    }

2: Narrowing Conversion:: (Manual) More to less we need to do it manual else it will be throw an error
beacuse there is fear of loose data we decreasing range 
@example 
    {
        double doubleValue = 10.5;
        int intValue = (int) doubleValue; // Explicit conversion (double to int)
    }

*/


```
public class Conversion{
    public static void main (String a[]){
        // widening conversion :
        // Byte x = 15;
        // int y = x;
        // System.out.print("widening conversion:L: " +y);

        //  Narrowing Conversion :
        double pointValue = 8.6;
        int intValue =(int) pointValue;
        System.out.print(" Narrowing Conversion:: " +intValue); 
    }
}
```

### Operators
/**
 1. Arithmetic Operators:
 int a = 10, b = 5;

// Addition
int sum = a + b; // Result: 15

// Subtraction
int difference = a - b; // Result: 5

// Multiplication
int product = a * b; // Result: 50

// Division
int quotient = a / b; // Result: 2

// Modulus (Remainder)
int remainder = a % b; // Result: 0

Increment and Decrement Operators:
int counter = 5;
// Increment
counter++; // Equivalent to: counter = counter + 1; // Result: 6

// Decrement
counter--; // Equivalent to: counter = counter - 1; // Result: 5

// pre increment 
int x = 5;
++x // Result 6 

// post increment 
int y = 19;
y++ // Result 20

2. Relational Operators:
int x = 5, y = 10;

// Equal to
boolean isEqual = (x == y); // Result: false

// Not equal to
boolean isNotEqual = (x != y); // Result: true

// Greater than
boolean isGreaterThan = (x > y); // Result: false

// Less than
boolean isLessThan = (x < y); // Result: true

// Greater than or equal to
boolean isGreaterOrEqual = (x >= y); // Result: false

// Less than or equal to
boolean isLessOrEqual = (x <= y); // Result: true

3: Logical Operators:
boolean p = true, q = false;

// Logical AND
boolean andResult = p && q; // Result: false

// Logical OR
boolean orResult = p || q; // Result: true

// Logical NOT
boolean notResult = !p; // Result: false

4. Assignment Operators:
int num = 10;

// Assignment
num = 20; // Value of 'num' is now 20

// Addition assignment
num += 5; // Equivalent to: num = num + 5; // Result: 25

// Subtraction assignment
num -= 3; // Equivalent to: num = num - 3; // Result: 22

// Multiplication assignment
num *= 2; // Equivalent to: num = num * 2; // Result: 44

// Division assignment
num /= 4; // Equivalent to: num = num / 4; // Result: 11

// Modulus assignment
num %= 3; // Equivalent to: num = num % 3; // Result: 2

 */

```
public class Operators{
    public static void main(String a[]){
        // Airthmatic
        // int x = 10 ;
        // float y = 10.5f;
        // byte result = (byte) (x + y);
        // System.out.println("result : "+ result);

        // Logical Operators : && , || , !
        int x = 1;
        byte y = 8;
        short z = (short) (x + y);
        System.out.println("Increment: " + (++x));
        // and (& or &&) 
        // boolean result = x > y & y < z; //true 
        // boolean result = x > y && y > z; // false

        // or || and not equal  !=
        boolean result = x!=y || y == z;
        System.out.print(result);
    }
}
```

### if-else Statements
```
if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}

Note: we can write multiple if else conditions using : 
else if (conditions)
```

```
// need to import package to get input from user 
// import java.util.Scanner;

// public class If_else_con{
//     public static viod main(String a[]){
//          // Create a Scanner object to read input
//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user for input
//         System.out.print("Enter your age: ");

//         // Read the user's input as an integer
//         int age = scanner.nextInt();

//         // // Close the scanner to release resources (good practice)
//         // scanner.close();

//         // int age = 18 ;
//         if (age < 18)
//             System.out.println("You are unable to Vote , your current age is "+ age);
//     }
// }
```

```
public class If_else_con{
    public static void main(String a[]){

        // using if else conditions 
        int age = 8 ;
        // if (age < 18)
        //     System.out.println("You are unable to Vote , your current age is "+ age);
        // else if (( age >= 18) && (age <= 45 ))
        //     System.out.println("You are able to Vote and you are such a young guy , your current age is "+ age);
        // else 
        //     System.out.println("You are able to Vote , your current age is "+ age);

        // using turnery operators 

        String result = age >= 18 ? ("You are able to Vote , your current age is "+ age) : ("Sorry! You are unaAle to Vote , your current age is "+ age);
        System.out.println(result);
    }
}
```
### Switch Statements 
In Java, the switch statement is a control flow statement that allows you to select one of many code blocks to be executed. It's typically used when you have a variable or expression and you want to perform different actions based on its value.

```
switch (expression) {
    case value1:
        // Code to be executed if expression equals value1
        break;
    case value2:
        // Code to be executed if expression equals value2
        break;
    // additional cases as needed
    default:
        // Code to be executed if expression doesn't match any of the cases
}

```
- The expression is evaluated once and its value is compared with the values of each case.
- If a case matches the value of the expression, the code block under that case is executed.
- The break statement is used to exit the switch statement. If break is omitted, execution will "fall through" to the next case.
- The default case is optional and is executed when none of the case values match the expression.

**@example**
```
public class Switch_Statements{
    public static void main(String a[]){
        int dayNumber = 5;
        String day;

        // first way to write switch statements
        // switch(dayNumber){
        //     case 1:
        //         day = "Monday";
        //         break;
        //     case 2:
        //         day = "Tuesday";
        //         break;
        //     case 3:
        //         day = "Wednesday";
        //         break;
        //     case 4:
        //         day = "Thrusday";
        //         break;
        //     case 5:
        //         day = "Friday";
        //         break;
        //     default:
        //         day = "Sunday";
        // }
        // System.out.println(day);

        // Second Way using -> without break keyword and (:)
        // day = switch(dayNumber){
        //     case 1->  "Monday";
        //     case 2->  "Tuesday";
        //     case 3->  "Wednesday";
        //     case 4->  "Thrusday";
        //     case 5->  "Friday";
        //     case 6->  "Saturday";
        //     case 7->  "sunday";
        //     default -> "Enter Valid Day Number Between 1-7 :";
        // };

        
        // Third Way using yield keyword if want to use (:) after case instead of arrow (->) ,  without break keyword
        day = switch(dayNumber){
            case 1 :  yield  "Monday";
            case 2 :  yield  "Tuesday";
            case 3 :  yield "Wednesday";
            case 4 :  yield "Thrusday";
            case 5 :  yield  "Friday";
            case 6 :  yield  "Saturday";
            case 7 :  yield "sunday";
            default:   yield "Enter Valid Day Number Between 1-7 :";
        };

        System.out.println(day);
    }
}
```

## Loops
Loops can execute a block of code as long as a specified condition is reached.

Loops are handy because they save time, reduce errors, and they make code more readable.

#### while Loop 

The while loop loops through a block of code as long as a specified condition is true:
```
public class WhileLoop{
    public static void main(String a[]){
        // print the number till 10 using while loop 
        int i = 0;
        // while (i < 11){
        //     System.out.println(i);
        //     i++;
        // };

        // print the sum of 1-10 numbers 
        // int sum = 0;
        // while (i < 11){
        //     System.out.println(i);
        //     sum+=i;
        //     i++;
        // };
        // System.out.println("Total Sum of 1 - 10 is : " + sum);

        // print the sum of first 10 even numbers 
        int count = 0, firstTenEvenNumbersSum = 0;
        while (count<10){
            if (i % 2 == 0) {
                firstTenEvenNumbersSum += i;
                count++;
                System.out.println(firstTenEvenNumbersSum);
            }
            i++;

        };
        System.out.println("Total Sum of first 10 even numbers is : " + firstTenEvenNumbersSum);
        System.out.println("Count is  : " + count);

    }
}
```

### do while Loop 
The do/while loop is a variant of the while loop. This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.
**Syntax**
```
do {
  // code block to be executed
}
while (condition);
```

The example below uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:

```
public class DoWhileLoop {
    public static void main(String a[]){
        // print reverse numbers 10 to 1 
        // int x = 10;
        // do
        // {
        //     System.out.println(x);
        //     x--;
        // }
        // while (x > 0);

        // print the sum of first 10 odd numbers 
        int i = 0;
        int count = 0;
        int sum = 0;
        do{
            if(i%2!=0){
                sum+=i;
                count++;
            };
            i++;
        }while(count < 23);

        System.out.println(sum);
    }
}
```

### For Loop

When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop:

**Syntax**
```
for (statement 1; statement 2; statement 3) {
  // code block to be executed
}
```
- Statement 1 is executed (one time) before the execution of the code block.

- Statement 2 defines the condition for executing the code block.

- Statement 3 is executed (every time) after the code block has been executed.

@example 
```
public class ForLoop {
    public static void main(String a[]) {
        // print the sum of first 15 numbers including print temself
        int sum = 0;
        for (int i = 0; i <= 15; i++) {
            sum += i;
            System.out.println("The value of current number is : " + i + "the value of sum is :  " + sum);
        }
        ;
        System.out.println("The value of current number is : " + sum);

    }
}

```

### For-Each Loop
There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

**Syntax**
```
for (type variableName : arrayName) {
  // code block to be executed
}
```

The enhanced for loop, also known as the "for-each" loop, provides a simpler way to iterate over elements in an array or a collection (like a List). It is particularly useful when you don't need to keep track of the index or manipulate it during the iteration.

@example
```

public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Enhanced for loop to iterate over the array
        for (int number : numbers) {
            System.out.println(number);
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }

    }
}

```

Note :  when using the enhanced for loop (for-each loop), it is expected that the array or collection should contain elements of the same type. The type of the loop variable (element in the loop) is determined by the type of elements in the array or collection.

For example, if you have an array of integers, the loop variable should be of type int. If you have an array of strings, the loop variable should be of type String. Mixing different types within the same array or collection would result in a compilation error.

### Java Methods (Functions) 
A method is a block of code which only runs when it is called.
You can pass data, known as parameters, into a method.
Methods are used to perform certain actions, and they are also known as functions.
Why use methods? To reuse code: define the code once, and use it many times.

- Create a Method
A method must be declared within a class. It is defined with the name of the method, followed by parentheses (). Java provides some pre-defined methods, such as System.out.println(), but you can also create your own methods to perform certain actions:

**Syntax**
```
public class Main {
  static void myMethod() {
    // code to be executed
  }
}
```
Explaination:

- myMethod() is the name of the method
- static means that the method belongs to the Main class and not an object of the Main class. - You will learn more about objects and how to access methods through objects later in this tutorial.
- - **void** means that this method does not have a return value. You will learn more about return values later in this chapter.

###### Java Method Parameters and Arguments:

Information can be passed to methods as parameter. Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses. You can add as many parameters as you want, just separate them with a comma.

Syntax of Method Declaration with Parameters:

**Syntax**
```
returnType methodName(parameterType1 parameterName1, parameterType2 parameterName2, ...) {
    // Method body
    // Use parameterName1, parameterName2, etc., in the method logic
}

returnType: The type of value that the method returns. It can be void if the method does not return any value.
methodName: The name of the method.
parameterType1, parameterType2, ...: The data types of the parameters.
parameterName1, parameterName2, ...: The names of the parameters used within the method.

@example
```
class Calculator
{
    public int add(int n1, int n2) 
    {
        return n1 + n2;
    }
    // Dont need to create instance to access this method 
    public static int multiply(int n1, int n2) 
    {
        return n1 * n2;
    }
}
```

```

###### Syntax of Method Invocation with Arguments:


**Syntax**
```
// methodName(argument1, argument2, ...)

methodName: The name of the method.
argument1, argument2, ...: The values passed to the method, corresponding to the parameters in order.

@example
```
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        // Calling the add method with arguments 5 and 7
        int result = calculator.add(5, 7);
        
        System.out.println("Result: " + result);
    }
```

```


##### Method Overloading
With method overloading, multiple methods can have the same name with different parameters:
@example
```
public class Calculator {

    // Method to add two integers
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    // Overloaded method to add two doubles
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int resultInt = calculator.add(5, 7);
        System.out.println("Result (int): " + resultInt);

        double resultDouble = calculator.add(5.5, 7.5);
        System.out.println("Result (double): " + resultDouble);
    }
}

Result (int): 12
Result (double): 13.0

```

@batter example 

```
public class Printer {

    // Method to print a string
    public void print(String message) {
        System.out.println(message);
    }

    // Overloaded method to print an integer
    public void print(int number) {
        System.out.println("Number: " + number);
    }

    // Overloaded method to print two integers
    public void print(int num1, int num2) {
        System.out.println("Numbers: " + num1 + " and " + num2);
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        
        printer.print("Hello, World!");
        printer.print(42);
        printer.print(3, 7);
    }
}

Results:
Hello, World!
Number: 42
Numbers: 3 and 7

```