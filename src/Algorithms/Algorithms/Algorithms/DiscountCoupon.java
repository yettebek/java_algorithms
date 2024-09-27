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
    // actual amount by the client
    public static BigDecimal bigDecimal, consumedAmount, discountedAmount;

    public static void isCouponValid() {

        // minimum amount necessary
        double minAmount = 27.5;

        // Expiration coupon's date
        LocalDate expirationDiscountDate = LocalDate.of(2024, 9, 30);

        // Today's date
        LocalDate todayDate = LocalDate.now();

        // Getting the user consumed amount
        Scanner sc = new Scanner(System.in);

        System.out.printf("\nTODAY IS %s%n", todayDate);

        System.out.print("\nEnter the amount consumed: ".toUpperCase());
        bigDecimal = sc.nextBigDecimal();
        consumedAmount = bigDecimal.setScale(2, RoundingMode.HALF_UP);

        System.out.printf("\nTOTAL CONSUMED: %.2f EUR", consumedAmount);

        sc.close();
    }

    public static BigDecimal applyDiscount() {
        System.out.println("\napplying 15% discount...".toUpperCase());

        // Applying a 15% discount
        double discount = 0.85;
        
        //Obtain the 2 decimal numbers only
        BigDecimal roundedFloor = consumedAmount.multiply(BigDecimal.valueOf(discount));

        return roundedFloor.setScale(2, RoundingMode.FLOOR);
    }

    public static void main(String[] args) {
        isCouponValid();
        discountedAmount = applyDiscount();
        //DecimalFormat df = new DecimalFormat("#0.00");
        //System.out.printf("TOTAL: " + df.format(discountedAmount) + " EUR");
        System.out.printf("TOTAL: %.2f EUR", discountedAmount);

    }
}
