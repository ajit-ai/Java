import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Scanner;

public class SHA256Hash {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string to be hashed:");
        String input = scanner.nextLine();
        System.out.println("String input: " + input);
        
        try {
            // Create SHA-256 MessageDigest instance
            MessageDigest md = MessageDigest.getInstance("SHA-256");

            // Digest the input bytes to generate the hash
            byte[] hashBytes = md.digest(input.getBytes());

            // Convert the byte array into a hexadecimal string
            StringBuilder hexString = new StringBuilder();
            for (byte b : hashBytes) {
                hexString.append(String.format("%02x", b));
            }

            // Print the SHA-256 hash value
            System.out.println("SHA-256 hash: " + hexString.toString());
        } catch (NoSuchAlgorithmException e) {
            System.err.println("SHA-256 algorithm not found.");
        }
        scanner.close();
    }
}
