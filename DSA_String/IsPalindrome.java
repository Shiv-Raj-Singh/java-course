package DSA_String;

// this function will check whether given string is palindrome or not 
class IsValidPalindrome {
    public static boolean isValidPalindromeString(String str) {
        if (str.length() <= 1) {
            return true;
        }
        str = str.toLowerCase();
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) == str.charAt(j)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }
}

public class IsPalindrome {
    public static void main(String a[]) {
        String x = "Naman";
        boolean res = IsValidPalindrome.isValidPalindromeString(x);
        System.out.println(res);

    }
}
