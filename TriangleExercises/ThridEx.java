/**
 * Draw a vertical line
 * Given a number n, print n lines, each with one asterisks
 */

public class ThridEx {
    public static void main(String[] args) {
        System.out.println("Let's print that asterisk in various lines:");
        ThridEx thrid = new ThridEx();
        thrid.printInLines(3);
    }

    private void printInLines(int n) {
        if (n > 0) {
            System.out.println("*");
            printInLines(n - 1);
        }
    }
}
