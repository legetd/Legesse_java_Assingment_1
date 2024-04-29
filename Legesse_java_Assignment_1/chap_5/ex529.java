
public class ex529 {
    public static void main(String[] args) {
        String[] ordinalNumbers = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "ninth", "tenth", "eleventh", "twelfth"};


        for (int i = 0; i < ordinalNumbers.length; i++) {
            System.out.println("On the " + ordinalNumbers[i] + " day of Christmas,");
            System.out.println("My true love sent to me:");

            for (int j = i; j >= 0; j--) {
                switch (j) {
                    case 0:
                        if (i == 0) {
                            System.out.println("A partridge in a pear tree.\n");
                        } else {
                            System.out.println;
                        }
                        break;
                    default:
                        System.out.println;
                        break;
                }
            }
        }
    }
}
