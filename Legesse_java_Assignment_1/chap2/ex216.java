import java.util.Scanner;

public class ex216 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

// use one System.out.println statement.
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
// use one System.out.println statement.   
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        if (num1 > num2)
            System.out.println(num1 + " is larger");
        else if (num1 < num2)
            System.out.println(num2 + " is larger");
        else
            System.out.println("These numbers are equal");

        input.close();
    }
}
