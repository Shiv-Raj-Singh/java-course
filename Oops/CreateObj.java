package Oops;

class Student {
    int age;
    String name;
    static boolean isAbleToVote;

    public void printStudentDetails() {
        System.out.println("This is new Student who's name :" + name + ", his age is : " + age + ", he able to vote :"
                + isAbleToVote);
    }
}

public class CreateObj {
    public static void main(String a[]) {
        Student.isAbleToVote = true;
        Student obj1 = new Student();
        obj1.name = "Shiv Raj";
        obj1.age = 21;
        System.out.println(obj1);
        obj1.printStudentDetails();

        // Student obj2 = new Student(23, "Mangal");
    }
}
