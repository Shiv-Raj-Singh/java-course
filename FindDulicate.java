public class FindDulicate {
    public static void main(String[] args) {
        int[] arr = { 11, 2, 3, 3, 5, 6, 7, 9 };

        int lenOfArray = arr.length;
        for (int i = 0; i < lenOfArray; i++) {
            // System.out.print(arr[i] + " , ");
        }
        int[] source = { 1, 2, 3 };
        int[] destination = new int[source.length + 1];
        System.arraycopy(arr, 0, destination, 0, 4);

        System.out.println(destination.length);
        for (int i = 0; i < 4; i++) {
            System.out.print(destination[i] + " , ");
        }
        
        arr[1] = 15;
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i] + " , ");
        }
        System.out.println("");
        for (int i = 0; i < 4; i++) {
            System.out.print(destination[i] + " , ");
        }
    }
}
