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