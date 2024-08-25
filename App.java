public class App {
    public static void main(String[] a) {
        // 2D array
        int[][] array2D = new int[3][4];

        for (int i = 0; i < array2D.length; i++) {
            int[] innerArray = array2D[i];
            for (int j = 0; j < innerArray.length; j++) {
                array2D[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int[] i : array2D) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}