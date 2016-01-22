/**
 * Draw a horizontal line
 * Given a number n, print n asterisks on one line.
 */

public class SecondEx {
    public static void main(String[] args) {
        System.out.println("Let's print that asterisk multiple times:");
        SecondEx second = new SecondEx();
        second.printMultiple(8); 
    }
  
    private void printMultiple(int n) {
        if (n > 0) {
            System.out.print("*");
            printMultiple(n - 1);
        }
    }
}
  

