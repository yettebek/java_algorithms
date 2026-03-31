package Algorithms.Algorithms;

public class PasswordGenerator {
    // Create a method that creates a random string of letters and numbers:
    public static String generatePassword() {
        String alphanumericString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789)(+!¿?_@#$%^&*";

        StringBuilder password = new StringBuilder();

        for (int i = 1; i <= 17; i++) {
            password.append(alphanumericString.charAt((int) (Math.random() * alphanumericString.length())));

        }
        return password.toString();

    }

    public static void main(String[] args) {
        // Print the generated password 5 times:
        for (int i = 1; i <= 5; i++) {
            System.out.printf("\nGenerated password nº%d: %s\n", i, generatePassword());
        }
    }
}
