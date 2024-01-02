// To Run this Must use below cmd 
/**
 * javac Objects.java
 * java Objects
 * 
 */

class Calculator {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public static int multiply(int n1, int n2) {
        return n1 * n2;
    }
}

public class Objects {
    public static void main(String a[]) {
        // create a method which will take 2 numbers and return sum of them
        int x = 5;
        int y = 12;
        // int result = x + y;
        // System.out.println(result);

        // without static menthod

        // // Calculator calc = new Calculator();
        // // int r = calc.add(x,y);
        // System.out.print("Sum after using method : " + r);

        // with static method
        int r = Calculator.multiply(x, y);
        System.out.print("Multiplicationb after using method : " + r);
    }
}
