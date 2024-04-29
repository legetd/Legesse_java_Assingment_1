import java.util.Scanner;

public class ex430 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("(1-20): ");
        int size = input.nextInt();

        // Validate input size
        if (size < 1 || size > 20) {
            System.out.println("1 and 20.");
        } else {
            // hollow square
            for (int row = 1; row <= size; row++) {
                for (int col = 1; col <= size; col++) {
                    if (row == 1 || row == size || col == 1 || col == size) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        input.close();
    }
}
