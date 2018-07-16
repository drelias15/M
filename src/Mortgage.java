import java.util.Scanner;

public class Mortgage {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //Declaring variables
        double loan = 0;
        double interest= 0;
        double monthlyPayment = 0;
        double balance = 0;
        int cp = 0;
        int yearsOfPayment;

        System.out.printf("Enter the loan amount: ");
        loan = keyboard.nextDouble();


        System.out.printf("Enter the interest rate on the loan: ");
        interest = keyboard.nextDouble();

        System.out.printf("Enter the term (years) for the loan payment: ");
        yearsOfPayment = keyboard.nextInt();

        System.out.printf("\n======================================");
        keyboard.close();

        //Declaring and initializing variables that will record the output of the method getMonthlyPayment
        monthlyPayment = getMonthlyPayment(loan, interest, yearsOfPayment);
        balance = -(monthlyPayment*(yearsOfPayment*12));

        //Will provide output with a particular format
        System.out.format("%-30s$%-+10.2f%n", "Balance owed to bank: ", balance);
        System.out.format("%-30s$%-+10.2f%n", "Minimum monthly payment: ", monthlyPayment);
    }

        //method to calculate monthly payment
    public static double getMonthlyPayment(double loan, double interest, int yearOfPayment) {
        double rate = (interest / 100) / 12;
        double base = (rate + 1);
        double months = yearOfPayment * 12;
        double result = 0.0;
        result = 1* (rate * (Math.pow(base, months)) / Math.pow(base, months));

        return result;
    }
}