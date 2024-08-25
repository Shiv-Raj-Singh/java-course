package DSA_String;

class CheckSubString {
    String str;

    public CheckSubString(String str) {
        this.str = str;
    }

    public boolean validatesStrings(String str, String sbStr) {
        int strLength = str.length();
        int subStrLength = sbStr.length();
        if (strLength < subStrLength || (strLength == subStrLength && str != sbStr)) {
            return false;
        }

        int left = 0, right = subStrLength;

        while (right <= strLength) {
            // Extract substring of length subStrLength
            String currentSubStr = str.substring(left, right);

            if (currentSubStr.equals(sbStr)) {
                return true; // Substring found
            } else {
                left++;
                right++;
            }
        }

        return false; // Substring not found
    }
}

public class SubStringExistOrNot {
    public static void main(String a[]) {
        // Test the method
        CheckSubString checker = new CheckSubString("Shivraj");
        boolean result = checker.validatesStrings("Shivraj", "avra");

        if (result) {
            System.out.println("Substring found!");
        } else {
            System.out.println("Substring not found!");
        }
    }
}
