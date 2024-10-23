package Algorithms.Algorithms;

import java.time.LocalDate;
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
//import java.text.DecimalFormat;

public class DiscountCoupon {
    /*
     * TRUE CASE = DATE HASN'T EXPIRED YET AND THE MINIMUM COMSUMPTION IS 27.5EUR
     * FALSE CASE = DATE HAS EXPIRED AND/OR MINIMUM COMSUPTION IS LOWER THAN 27.5
     */

    // Variables
    private static BigDecimal bigDecimal, consumedAmount;

    public static void isCouponValid() {

        // minimum amount necessary
        BigDecimal minAmount = new BigDecimal(27.5);

        // Expiration coupon's date
        LocalDate expirationDiscountDate = LocalDate.of(2024, 10, 30);

        // Today's date
        LocalDate todayDate = LocalDate.now();

        // Getting the user consumed amount
        Scanner sc = new Scanner(System.in);

        System.out.printf("\nTODAY IS %s%n", todayDate);
        try {
            System.out.print("\nEnter the amount consumed: ".toUpperCase());
            bigDecimal = sc.nextBigDecimal();
            consumedAmount = bigDecimal.setScale(2);

        } catch (ArithmeticException e) {
            System.err.println("Please, enter 2 decimals.".toUpperCase());
            System.exit(1);
        }

        sc.close();

        // Coupon validation
        if (consumedAmount.compareTo(minAmount) < 0) {
            System.out.println("Error. Consumption lower than 27.5 EUR".toUpperCase());
        } else if (todayDate.isAfter(expirationDiscountDate)) {
            System.out.println("Error. Coupon has expired.".toUpperCase() + " (" + expirationDiscountDate + ")");
        } else {
            System.out.println("Eligible coupon.".toUpperCase());
            applyDiscount();
        }
    }

    public static void applyDiscount() {
        System.out.println("\napplying 15% discount...".toUpperCase());

        // Applying a 15% discount
        double discount = 0.85;

        // Obtain the 2 decimal numbers only
        BigDecimal discountedAmount = consumedAmount.multiply(BigDecimal.valueOf(discount));
        discountedAmount.setScale(2, RoundingMode.FLOOR);

        // DecimalFormat df = new DecimalFormat("#0.00");
        // System.out.printf("TOTAL: " + df.format(discountedAmount) + " EUR");
        System.out.printf("TOTAL: %.2f EUR", discountedAmount);
    }

    public static void main(String[] args) {
        isCouponValid();
    }
}