public class Array {
    public static void main(String a[]) {

        // simple integer array
        int[] intArray = { 1, 2, 3, 4, 5 };
        System.out.println(intArray[intArray.length - 1]);
        // print all items of an array
        // for (int i : intArray){
        // System.out.println(i);
        // };

        String strArray[] = new String[5];

        for (int i = 0 ; i < strArray.length ; i++){
            System.out.println(strArray[i]);
        }

        
    }
}
