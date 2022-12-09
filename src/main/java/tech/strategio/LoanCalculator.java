package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {

    /**
     * A calculator to know how much is left to pay after have paid 3 months of a loan
     * 
     * @param amount The initial amount of the loan
     * @return The amount left after 3 month of payments
     */
    static int getRemainingAmountIn3Months(int amount) {
        int result = amount;
        for (int i = 0; i < 3; i++) {
            result = result - (int)(result * 0.1);
        }
        return result;
//        return (int)(0.729*amount);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
             System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
