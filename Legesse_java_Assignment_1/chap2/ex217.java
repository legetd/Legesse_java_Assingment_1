import java.util.Scanner;

public class ex217 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 1 2 3");
        int num1 = input.nextInt();

        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        System.out.print("Enter third integer: ");
        int num3 = input.nextInt();

        int sum = num1 + num2 + num3;
        int average = sum / 3;
        int product = num1 * num2 * num3;

        int smallest = Math.min(Math.min(num1, num2), num3);
        int largest = Math.max(Math.max(num1, num2), num3);

        System.out.printf("Sum: %d%n", sum);
        System.out.printf("Average: %d%n", average);
        System.out.printf("Product: %d%n", product);
        System.out.printf("Smallest: %d%n", smallest);
        System.out.printf("Largest: %d%n", largest);

        input.close();
    }
}
