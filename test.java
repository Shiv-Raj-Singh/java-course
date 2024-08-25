// class calculator{
//     public int sum(int num1 , int num2){
//         if((num1 + num2) >= 10){
//             return (num1 + num2) ;
//         }
//         // return 0;
//     }
// }

class Person {
    String name;
    int age;
    String mobileNumber;
    String email;
    boolean isWorking;
    String education;

    // Constructor
    public Person(String name, int age, String mobileNumber, String email, boolean isWorking, String education) {
        this.name = name;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.email = email;
        this.isWorking = isWorking;
        this.education = education;
    }

    // Getters and setters (optional)
    // toString method to display the object (optional)
}

public class test {
    public static void main(String xyz[]) {
        System.out.println("This is first line...");

        // Creating an instance
        Person person = new Person("John", 25, "1234567890", "john@example.com", true, "B.Tech");

        System.out.println(person.name +"\n" + person.email); // Accessing a value
    }
}
