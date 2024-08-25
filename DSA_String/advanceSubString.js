class CheckSubString {
    constructor(str) {
        this.str = str;
    }

    // Rabin-Karp algorithm for substring search
    // TC: O(N), where N is the length of the input string
    // SC: O(1)
    validatesStrings(str, sbStr) {
        const strLength = str.length;
        const subStrLength = sbStr.length;

        // If the input string is shorter or equal to the substring, substring is not possible
        if (strLength < subStrLength || (strLength === subStrLength && str != sbStr)) {
            return false;
        }

        // Calculate hash for the substring
        const subStrHash = this.hash(sbStr);

        // Calculate hash for the first substring of length subStrLength in the input string
        let currentHash = this.hash(str.substring(0, subStrLength));

        // TC: O(N)
        for (let i = 0; i <= strLength - subStrLength; i++) {
            // Check if the current substring has the same hash as the target substring
            if (currentHash === subStrHash && str.substring(i, i + subStrLength) === sbStr) {
                return true; // Substring found
            }

            // Update the hash for the next substring
            if (i < strLength - subStrLength) {
                currentHash = this.updateHash(currentHash, str[i], str[i + subStrLength], subStrLength);
            }
        }

        return false; // Substring not found
    }

    // Helper method to calculate the hash of a string
    hash(s) {
        let hash = 0;
        for (const c of s) {
            hash = (hash * 31 + c.charCodeAt(0)) % 101; // Using a prime number as a base and a modulus for avoiding overflow
        }
        return hash;
    }

    // Helper method to update the hash for the next substring
    updateHash(oldHash, oldChar, newChar, subStrLength) {
        let updatedHash = (oldHash - oldChar.charCodeAt(0) * this.pow(31, subStrLength - 1)) * 31 + newChar.charCodeAt(0);
        return (updatedHash % 101 + 101) % 101; // Modulus to ensure the hash is positive
    }

    // Helper method for calculating powers in the updateHash method
    pow(base, exp) {
        let result = 1;
        while (exp > 0) {
            if (exp % 2 === 1) {
                result = (result * base) % 101;
            }
            base = (base * base) % 101;
            exp /= 2;
        }
        return result;
    }
}

// Test the method
const checker = new CheckSubString("Shivraj");
// TC: O(N), where N is the length of the input string
// SC: O(1)
const result = checker.validatesStrings("Shivraj", "vra");

if (result) {
    console.log("Substring found!");
} else {
    console.log("Substring not found!");
}
