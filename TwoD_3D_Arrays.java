public class TwoD_3D_Arrays {
    public static void main(String a[]) {
        int arr[][] = new int[3][4];

        // first way to print this array of multi diamentional along with assignment
        // values
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // arr[i][j] = (int) (Math.random() * 10);
        // // System.out.print(arr[i][j] + " ");
        // }
        // // System.out.println();
        // }

        // // print arrays using for each loop
        // for (int inrArr[] : arr) {
        // for (int item : inrArr) {
        // System.out.print(item + " ");
        // }
        // System.out.println();
        // }

        // jagged array
        int[][] arr3D = new int[4][];
        // Initializing the sub-arrays with different lengths
        arr3D[0] = new int[]{1, 2, 3, 4};
        arr3D[1] = new int[]{1, 2, 3};
        arr3D[2] = new int[]{1, 5, 6, 3, 8, 1, 1};
        arr3D[3] = new int[]{8, 1, 1, 1, 1, 1, 1, 1, 3};

        // print entire aray

        for (int[] outerArray : arr3D){
            for (int item : outerArray){
                System.out.print(item +" ");
            }
            System.out.println();
        }

    }
}
