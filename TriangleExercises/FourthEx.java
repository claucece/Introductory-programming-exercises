/**
 * Draw a right triangle
 * Given a number n, print n lines, each with one more asterisk than the last 
 * (i.e. one on the first line, two on the second,etc.) 
 */

public class FourthEx {
    public static void main(String[] args) {
        System.out.println("Let's make a triangle out of it:");
        FourthEx fourth = new FourthEx();
        fourth.printTriangle(9);
    }

    private void printTriangle(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) 
            System.out.print("*");
            System.out.println();
        }
    }
}
