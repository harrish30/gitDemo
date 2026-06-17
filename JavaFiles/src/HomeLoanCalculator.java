import java.util.Scanner;

public class HomeLoanCalculator
{
    public static void homeLoanCalculator(int totalAmount, int downPayment, int rate, int tenure)
    {
        // Loan amount after subtracting down payment
        double principal = totalAmount - downPayment;

        // Monthly interest rate
        double monthlyRate = rate / (12.0 * 100.0);

        // Total number of monthly installments
        int months = tenure * 12;

        // EMI calculation formula
        double emi = (principal * monthlyRate * Math.pow(1 + monthlyRate, months))
                / (Math.pow(1 + monthlyRate, months) - 1);

        // Total payment and interest
        double totalPayment = emi * months;
        double totalInterest = totalPayment - principal;

        // Output
        System.out.println("===== Home Loan Details =====");
        System.out.println("Property Amount : " + totalAmount);
        System.out.println("Down Payment    : " + downPayment);
        System.out.println("Loan Amount     : " + principal);
        System.out.println("Interest Rate   : " + rate + "%");
        System.out.println("Tenure          : " + tenure + " years");
        System.out.println("Monthly EMI     : " + String.format("%.2f", emi));
        System.out.println("Total Interest  : " + String.format("%.2f", totalInterest));
        System.out.println("Total Payment   : " + String.format("%.2f", totalPayment));
    }
}
