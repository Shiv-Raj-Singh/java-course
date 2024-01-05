
class MethodForArray {
    // Method to convert an array to a string
    public static String arrayToString(int[] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

    public static String arrayToString(int[][][] array) {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            result.append("["); // Start of 2D array
            for (int j = 0; j < array[i].length; j++) {
                result.append("["); // Start of 1D array
                for (int k = 0; k < array[i][j].length; k++) {
                    result.append(array[i][j][k]);
                    if (k < array[i][j].length - 1) {
                        result.append(", ");
                    }
                }
                result.append("]"); // End of 1D array
                if (j < array[i].length - 1) {
                    result.append(", ");
                }
            }
            result.append("]"); // End of 2D array
            if (i < array.length - 1) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }

}

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
        // int[][] arr3D = new int[4][];

        // Initializing the sub-arrays with different lengths
        // arr3D[0] = new int[]{1, 2, 3, 4};
        // arr3D[1] = new int[]{1, 2, 3};
        // arr3D[2] = new int[]{1, 5, 6, 3, 8, 1, 1};
        // arr3D[3] = new int[]{8, 1, 1, 1, 1, 1, 1, 1, 3};

        // // print entire aray

        // for (int[] outerArray : arr3D){
        // for (int item : outerArray){
        // System.out.print(item +" ");
        // }
        // System.out.println();
        // }

        int threeDArr[][][] = new int[4][3][2];

        for (int i = 0; i < threeDArr.length; i++) {
            int outterArray[][] = threeDArr[i];
            for (int j = 0; j < outterArray.length; j++) {
                int innerArray[] = outterArray[j];
                for (int k = 0; k < innerArray.length; k++) {
                    int randomNumber = (int) (Math.random() * 10);
                    innerArray[k] = randomNumber;
                    System.out.print(innerArray[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
        ;
        
        System.out.println(MethodForArray.arrayToString(threeDArr));
    }
}
