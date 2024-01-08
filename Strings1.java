public class Strings1 {
    public static void main(String a[]){
        // different ways to create a string string is non primitive data types in java 
        String str1 = "Shiv Raj";
        // Or
        String str2 = new String(" Singh");
        System.out.println(str1 + str2);
        String name = str1 + str2 ;

        // few string method 
        // charAt find any character using index 
        // System.out.println("In Shiv Raj chatAt on 5 index : " + str1.charAt(5));
        for (int i = 0 ;i < name.length() ; i++ ){
            System.err.println(name.charAt(i));
        }
    }
}
