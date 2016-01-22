/**
 * Diamond with Name
 * Given a number n, print a centered diamond with your name in place of the middle line.
 */

public class NameInDiamond {
    public static void main(String[] args) {
        System.out.println("Lets make a Diamond with name out of it:");
        NameInDiamond diamondWithName = new NameInDiamond();
        diamondWithName.makeFirst(5);
    }

    private void makeFirst(int height) {
        int base = (2 * height) - 1;
    
        for (int i = 0; i < height; i++) {
            if (i == height - 1) {
                System.out.println("  Sofia");
                break;
            }
            int asterisk = (2 * i) + 1;
            int space = (base - asterisk) / 2;
            printDiamond(space, asterisk);
            System.out.println();
         }
        int minus = height - 1;
        makeSecond(minus, base);
    }

    private void makeSecond(int minus, int base) {
        for (int i = minus; i > 0; i--) {
            int asterisk = (2 * i) - 1;
            int space = (base - asterisk) / 2;
            printDiamond(space, asterisk);
            System.out.println();
        }
    }

    private void printDiamond(int space, int asterisk) {
        for (int j = 0; j < space; j++)
            System.out.print(" ");
        for (int k = 0; k < asterisk; k++)
            System.out.print("*");
    }
    
}

