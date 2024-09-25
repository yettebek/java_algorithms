package Algorithms.Algorithms;

public class StringEndsWith {

    public static boolean solution(String str, String ending) {
        if (str.endsWith(ending)) {
            return true;
        } 
        return false;
    }
    public static void main(String[] args) {
        boolean result = solution("!@#$%^&*() :-)", ":-)");
        System.out.println("StringEndsWith = " + result);
    }
}
