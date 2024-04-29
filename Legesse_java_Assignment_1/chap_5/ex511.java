import java.util.Scanner;

public class ex511 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter the number of values
        System.out.print("Enter the number of values: ");
        int numValues = input.nextInt();

        // Prompt the user to enter the first value
        System.out.print("Enter value 1: ");
        int smallest = input.nextInt();

        // Iterate through the remaining values to find the smallest
        for (int i = 2; i <= numValues; i++) {
            System.out.print("Enter value " + i + ": ");
            int currentValue = input.nextInt();
            if (currentValue < smallest) {
                smallest = currentValue;
            }
        }

        // Display the smallest value
        System.out.println("The smallest value is: " + smallest);

        input.close();
    }
}
