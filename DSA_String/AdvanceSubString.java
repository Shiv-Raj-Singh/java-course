package DSA_String;

class CheckSubString {
    private String str;

    public CheckSubString(String str) {
        this.str = str;
    }

    // Rabin-Karp algorithm for substring search
    // TC: O(N), where N is the length of the input string
    // SC: O(1)
    public boolean validatesStrings(String str, String sbStr) {
        int strLength = str.length();
        int subStrLength = sbStr.length();

        // If the input string is shorter or equal to the substring, substring is not possible
        if (strLength < subStrLength || (strLength == subStrLength && str != sbStr)) {
            return false;
        }

        // Calculate hash for the substring
        int subStrHash = hash(sbStr);

        // Calculate hash for the first substring of length subStrLength in the input string
        int currentHash = hash(str.substring(0, subStrLength));

        // TC: O(N)
        for (int i = 0; i <= strLength - subStrLength; i++) {
            // Check if the current substring has the same hash as the target substring
            if (currentHash == subStrHash && str.substring(i, i + subStrLength).equals(sbStr)) {
                return true; // Substring found
            }

            // Update the hash for the next substring
            if (i < strLength - subStrLength) {
                currentHash = updateHash(currentHash, str.charAt(i), str.charAt(i + subStrLength), subStrLength);
            }
        }

        return false; // Substring not found
    }

    // Helper method to calculate the hash of a string
    private int hash(String s) {
        int hash = 0;
        for (char c : s.toCharArray()) {
            hash = (hash * 31 + c) % 101; // Using a prime number as a base and a modulus for avoiding overflow
        }
        return hash;
    }

    // Helper method to update the hash for the next substring
    private int updateHash(int oldHash, char oldChar, char newChar, int subStrLength) {
        int updatedHash = (oldHash - oldChar * pow(31, subStrLength - 1)) * 31 + newChar;
        return (updatedHash % 101 + 101) % 101; // Modulus to ensure the hash is positive
    }

    // Helper method for calculating powers in the updateHash method
    private int pow(int base, int exp) {
        int result = 1;
        while (exp > 0) {
            if (exp % 2 == 1) {
                result = (result * base) % 101;
            }
            base = (base * base) % 101;
            exp /= 2;
        }
        return result;
    }
}

public class AdvanceSubString {
    public static void main(String a[]) {
        // Test the method
        CheckSubString checker = new CheckSubString("Shivraj");
        
        // TC: O(N), where N is the length of the input string
        // SC: O(1)
        boolean result = checker.validatesStrings("Shivraj", "vra");

        if (result) {
            System.out.println("Substring found!");
        } else {
            System.out.println("Substring not found!");
        }
    }
}
