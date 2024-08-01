import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence to be coded");
        String str = sc.nextLine();

        if ((str.length() % 2) != 0) {
            str = str + "0";
        }

        int numRows = 2;
        int numCols = str.length() / 2;
        int a[][] = new int[numRows][numCols];
        int b[][] = { { 1, 0 }, { 1, -1 } };
        int c[][] = new int[numRows][numCols]; // Initialize matrix 'c'

        int k = 0;
        for (int j = 0; j < numCols; j++) {
            for (int i = 0; i < numRows; i++) {
                char ch = Character.toUpperCase(str.charAt(k++));
                if (ch >= 'A' && ch <= 'Z') {
                    a[i][j] = ch - 'A'; // Map characters to 0-25 (A-Z -> 0-25)
                } else {
                    a[i][j] = 0; // Skip non-alphabetic characters and map to 0
                }
            }
        }

        // Encoding the message using matrix multiplication
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                c[i][j] = b[i][0] * a[0][j] + b[i][1] * a[1][j];
                c[i][j] %= 27; // Apply modulo 26 to keep the result within 0-25 (A-Z range)
                if (c[i][j] < 0) {
                    c[i][j] += 27; // Handle negative values
                }
            }
        }

        // Decoding the message using the inverse of matrix 'b'
        int det = b[0][0] * b[1][1] - b[0][1] * b[1][0];
        int invDet = modInverse(det, 27);
        int invB[][] = { { b[1][1], -b[0][1] }, { -b[1][0], b[0][0] } };
        int decoded[][] = new int[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                decoded[i][j] = (invB[i][0] * c[0][j] + invB[i][1] * c[1][j]) * invDet % 26;
                decoded[i][j] = (decoded[i][j] + 27) % 27; // Handle negative values
            }
        }

        // Display the encoded and decoded messages
        System.out.println("Encoded: " + getEncodedString(c));
        System.out.println("Decoded: " + getDecodedString(decoded));
    }

    // Function to calculate the modular inverse of a number 'a' under modulo 'm'
    private static int modInverse(int a, int m) {
        a = a % m;
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        return 1;
    }

    // Helper function to convert matrix 'c' back to a string
    private static String getEncodedString(int[][] c) {
        StringBuilder encodedStr = new StringBuilder();
        for (int j = 0; j < c[0].length; j++) {
            encodedStr.append((char) (c[0][j] + 'A')); // Convert back to character
            encodedStr.append((char) (c[1][j] + 'A')); // Convert back to character
        }
        return encodedStr.toString();
    }

    // Helper function to convert matrix 'decoded' back to a string
    private static String getDecodedString(int[][] decoded) {
        StringBuilder decodedStr = new StringBuilder();
        for (int j = 0; j < decoded[0].length; j++) {
            decodedStr.append((char) (decoded[0][j] + 'A')); // Convert back to character
            decodedStr.append((char) (decoded[1][j] + 'A')); // Convert back to character
        }
        return decodedStr.toString();
    }
}
