/**
validateStrings function:

This function checks if a substring exists in a given string using the Rabin-Karp algorithm.
It takes two parameters: str (the input string) and sbStr (the substring to search for).
It calculates the hash for the substring and the first substring of the same length in the input string.
It iterates through the input string, checking if the hash matches and if the substrings are equal.
If a match is found, it returns true; otherwise, it returns false.
hash function:

Calculates the hash of a given string using the Rabin-Karp hash function.
updateHash function:

Updates the hash for the next substring by subtracting the contribution of the outgoing character and adding the contribution of the incoming character.
pow function:

Calculates powers efficiently using an iterative approach.
Test and Output:

The code tests the validateStrings function with the input string "Shivraj" and the substring "vra".
It outputs whether the substring is found or not.
 */

// Function to check if a substring exists in a given string using Rabin-Karp algorithm
// Time Complexity (TC): O(N), where N is the length of the input string
// Space Complexity (SC): O(1)
function validateStrings(str, sbStr) {
  const strLength = str.length;
  const subStrLength = sbStr.length;

  // If the input string is shorter or equal to the substring, substring is not possible
  if (strLength < subStrLength || strLength === subStrLength) {
    return false;
  }

  // Calculate hash for the substring
  const subStrHash = hash(sbStr);

  // Calculate hash for the first substring of length subStrLength in the input string
  let currentHash = hash(str.substring(0, subStrLength));

  // Iterate through the input string
  for (let i = 0; i <= strLength - subStrLength; i++) {
    // Check if the current substring has the same hash as the target substring
    if ( currentHash === subStrHash && str.substring(i, i + subStrLength) === sbStr) {
      return true; // Substring found
    }

    // Update the hash for the next substring
    if (i < strLength - subStrLength) {
      currentHash = updateHash(
        currentHash,
        str.charAt(i),
        str.charAt(i + subStrLength),
        subStrLength
      );
    }
  }

  return false; // Substring not found
}

// Helper function to calculate the hash of a string
function hash(s) {
  let hash = 0;
  for (const c of s) {
    hash = (hash * 31 + c.charCodeAt(0)) % 101; // Using a prime number as a base and a modulus for avoiding overflow
  }
  return hash;
}

// Helper function to update the hash for the next substring
function updateHash(oldHash, oldChar, newChar, subStrLength) {
  let updatedHash =
    (oldHash - oldChar.charCodeAt(0) * pow(31, subStrLength - 1)) * 31 +
    newChar.charCodeAt(0);
  return ((updatedHash % 101) + 101) % 101; // Modulus to ensure the hash is positive
}

// Helper function for calculating powers in the updateHash function
function pow(base, exp) {
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

// Test the function
const result = validateStrings("Shivraj", "vra");

// Output the result
if (result) {
  console.log("Substring found!");
} else {
  console.log("Substring not found!");
}


let hash1 = 0;  // Initial hash value
let c = 'A';   // Character 'A'

// Calculate new hash value
hash1 = (hash1 * 31 + c.charCodeAt(0)) % 101;

console.log(hash1);  // Output: 65 (Unicode code point of 'A')
