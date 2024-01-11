package DSA_String;

class CheckAnagramStrings {
    public static boolean isvalidAnagram(String s1, String s2) {
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0 ; i < s1.length() ; i++){
            char a = s1.charAt(i);
            if(s2.indexOf(a) == -1){
                return false ;
            }
        }
        return true;
    }
}

public class IsAnagram {
    public static void main(String a[]) {
        StringBuilder str = new StringBuilder("Mangal");
        StringBuffer str2 = new StringBuffer("AngalM");

        boolean isAnaStrings = CheckAnagramStrings.isvalidAnagram(str.toString(), str2.toString());

        System.out.println("Given String are An Anagram : " + isAnaStrings);
    }
}
