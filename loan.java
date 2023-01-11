import java.util.Scanner;

public class CarLoanPricing {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get loan amount, interest rate, and loan term from the user
        System.out.print("Enter the loan amount: ");
        double loanAmount = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in percent): ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter the loan term (in months): ");
        int loanTerm = scanner.nextInt();

        // Convert interest rate to a monthly rate
        interestRate /= 100.0;
        interestRate /= 12.0;

        // Calculate the monthly payment
        double monthlyPayment = loanAmount * (interestRate / (1.0 - Math.pow(1.0 + interestRate, -loanTerm)));

        // Calculate the total payment
        double totalPayment = monthlyPayment * loanTerm;

        // Print the results
        System.out.printf("Monthly Payment: $%.2f\n", monthlyPayment);
        System.out.printf("Total Payment: $%.2f\n", totalPayment);
    }
}
