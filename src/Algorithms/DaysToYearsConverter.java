package Algorithms.Algorithms;

public class DaysToYearsConverter {
    public static void main(String[] args) {
        int totalDays = 77;
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30; // approximate months
        int days = remainingDays % 30;

        System.out.println(totalDays + " days are: " + years + " years, " + months + " months, and " + days + " days.");
    }
}
