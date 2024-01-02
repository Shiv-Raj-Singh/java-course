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