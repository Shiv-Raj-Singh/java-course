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