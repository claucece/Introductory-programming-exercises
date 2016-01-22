/**
 * Diamond
 * Given a number n, print a centered diamond.
 */

public class Diamond {
    public static void main(String[] args) {
        System.out.println("Let's make a Diamond out of it:");
        Diamond gem = new Diamond();
        gem.setFirst(4);
    }
    
    private void setFirst(int height) {
        int base = (2 * height) - 1;
        for (int i = 0; i < height; i++) {
            int asterisk = (2 * i) + 1;
            int space = (base - asterisk) / 2;
            getFunctionality(space, asterisk);
            System.out.println();
        }
        int minus = height - 1;
        setSecond(minus, base);
    }
    
    private void setSecond(int minus, int base) {
        for (int i = minus; i > 0; i--) {
            int asterisk = (2 * i) - 1;
            int space = (base - asterisk) / 2;
            getFunctionality(space, asterisk);
            System.out.println();
        }
    }
    
    private void getFunctionality(int space, int asterisk) {
        for (int j = 0; j < space; j++)
            System.out.print(" ");
        for (int k = 0; k < asterisk; k++)
            System.out.print("*");
    }

}



