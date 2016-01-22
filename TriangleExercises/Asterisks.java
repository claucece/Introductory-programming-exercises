/**
 * All exercises in one
 */

public class Asterisks {
    
    public void drawMultiple(int n) {
        if (n > 0) {
            System.out.print("*");
            drawMultiple(n - 1);
        }
    }
   
    public void drawInLines(int n) {
        if (n > 0) {
            System.out.println("*");
            drawInLines(n - 1);
        }
    }

    public void drawTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
            System.out.print("*"); }
        System.out.println();
        }
    }
}        
