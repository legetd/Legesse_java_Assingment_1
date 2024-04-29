
public class ex512 {
    public static void main(String[] args) {
        int product = 1;

        // odd integers from 1 to 15.
        for (int i = 1; i <= 15; i += 2) {
            product *= i;
        }

        // Display the product of the odd integers
        System.out.println("odd integers 1 to 15 is: " + product);
    }
}
