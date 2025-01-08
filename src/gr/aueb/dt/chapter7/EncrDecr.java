package gr.aueb.dt.chapter7;

public class EncrDecr { // Encrypt a string by replacing each character with the next lexicographic character
    public static String encrypt(String input) {
        if (input == null) {
            return ""; // Return empty string for null input
        }

        String encrypted = ""; // Initialize the result as an empty string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Encrypt only uppercase Latin letters
            if (c >= 'A' && c <= 'Z') {
                // Circular replacement using mod 26
                c = (char) ('A' + (c - 'A' + 1) % 26);
            }
            encrypted += c; // Concatenate the character to the result
        }
        return encrypted;
    }

    // Decrypt a string by replacing each character with the previous lexicographic character
    public static String decrypt(String input) {
        if (input == null) {
            return ""; // Return empty string for null input
        }

        String decrypted = ""; // Initialize the result as an empty string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Decrypt only uppercase Latin letters
            if (c >= 'A' && c <= 'Z') {
                // Circular replacement using mod 26
                c = (char) ('A' + (c - 'A' - 1 + 26) % 26);
            }
            decrypted += c; // Concatenate the character to the result
        }
        return decrypted;
    }

    public static void main(String[] args) {
        // Input string for testing
        String original = "ABC XYZ";
        System.out.println("Original String: " + original);

        // Encrypt the string
        String encrypted = encrypt(original);
        System.out.println("Encrypted String: " + encrypted);

        // Decrypt the string
        String decrypted = decrypt(encrypted);
        System.out.println("Decrypted String: " + decrypted);
    }
}