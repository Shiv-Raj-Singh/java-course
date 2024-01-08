/**
 * Java File: StringDefinitions.java
 * ---------------------------------
 * This file contains examples and comments explaining the concepts of strings,
 * immutable strings, and mutable strings in Java.
 */

// Default type of strings in Java
// Strings are objects of the String class and are immutable by default.

// Immutable Strings
// - Definition: Strings whose values cannot be modified once they are created.
// - Characteristics:
// - Any operation that appears to modify a string actually creates a new
// string.
// - Immutable strings are thread-safe.

// Mutable Strings
// There are alternatives for mutable strings, such as StringBuilder and
// StringBuffer.

public class StrImAndMutable {

    /**
     * Example: Immutable String
     * - The example showcases the creation and manipulation of an immutable string
     * using the String class.
     */
    public class StringDefinitions {
        public static void main(String[] args) {
            // Immutable String Example
            String immutableStr = "Hello";
            immutableStr = immutableStr.concat(" World"); // Creates a new string
            System.out.println(immutableStr); // Prints "Hello World"
        }

        /**
         * Example: Mutable StringBuilder
         * - The example demonstrates the use of StringBuilder, a mutable sequence of
         * characters.
         * - StringBuilder is more efficient than String for concatenation operations.
         */
        private static void mutableStringBuilderExample() {
            StringBuilder mutableStr = new StringBuilder("Hello");
            mutableStr.append(" World"); // Modifies the same object
            System.out.println(mutableStr.toString()); // Prints "Hello World"
        }

        /**
         * Example: Mutable StringBuffer
         * - The example showcases the use of StringBuffer, similar to StringBuilder but
         * synchronized.
         * - StringBuffer is useful in multithreaded environments where synchronization
         * is needed.
         */
        private static void mutableStringBufferExample() {
            StringBuffer synchronizedStr = new StringBuffer("Hello");
            synchronizedStr.append(" World"); // Modifies the same object
            System.out.println(synchronizedStr.toString()); // Prints "Hello World"
        }
    }

}
