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
