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