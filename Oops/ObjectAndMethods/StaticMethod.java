package Oops.ObjectAndMethods;

class StaticMethods{
    int age = 20;
    static void printName(String name){
        System.out.println("My name is " + name + " " + "Inside static method.");
    }
    static void printAge(int userAge ){
        userAge ? System.out.println("My age is " + userAge + " " + "Inside static method.") : System.out.println("My age is " + age + " " + "Inside static method.");
    }
}