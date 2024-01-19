package Algorithms;

public class PasswordGenerator {
    //Create a method that creates a random string of letters and numbers:
    public static String generatePassword() {
<<<<<<< HEAD
        String alphanumericString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789)(+!¿?_@#$%^&*";
    
        StringBuilder password = new StringBuilder();

        for (int i = 1; i <=17; i++) {
=======
        String alphanumericString = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789)(/+!¿?_-@#$%^&*";
    
        StringBuilder password = new StringBuilder();

        for (int i = 1; i <=12; i++) {
>>>>>>> 17a0938a6f2ca6e122484646264787a3dd71534d
            password.append(alphanumericString.charAt((int) (Math.random() * alphanumericString.length())));
        
        }
        return password.toString();
        
    }
    public static void main(String[] args) {
        //Print the generated password 5 times:
        for (int i = 1; i <= 5; i++) {
            System.out.printf("\nGenerated password nº%d: %s\n", i, generatePassword());
        }
    }
}
