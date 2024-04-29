import java.util.Scanner;

public class ex417 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data for each employee
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter data for employee " + i + ":");
            System.out.print("Hours worked last week: ");
            int hoursWorked = input.nextInt();
            System.out.print("Hourly rate: $");
            double hourlyRate = input.nextDouble();

            // Calculate gross pay
            double grossPay = calculateGrossPay(hoursWorked, hourlyRate);

            // Display employee's gross pay
            System.out.println("Employee " + i + "'s gross pay: $" + grossPay);
            System.out.println();
        }

        input.close();
    }

    // Method to calculate gross pay
    public static double calculateGrossPay(int hoursWorked, double hourlyRate) {
        double grossPay;

        if (hoursWorked <= 40) {
            grossPay = hoursWorked * hourlyRate; // Straight time
        } else {
            grossPay = 40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5; // Straight time + time and a half
        }

        return grossPay;
    }
}
