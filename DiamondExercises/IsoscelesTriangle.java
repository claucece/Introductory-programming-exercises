/**
 * Isosceles Triangle
 * Given a number n, print a centered triangle.
 */

public class IsoscelesTriangle {
    public static void main(String[] args) {
        System.out.println("Let's make an isosceles Triangle out of it:");
        IsoscelesTriangle isosceles = new IsoscelesTriangle();
        isosceles.setTriangle(5);
    }

    private void setTriangle(int height) {
       int base = (2 * height) - 1;
       for (int i = 0; i < height; i++) {
           int asterisk = (2 * i) + 1;
           int space = (base - asterisk) / 2;
           getTriangle(space, asterisk);
           System.out.println();
       }  
    }
 
    private void getTriangle(int space, int asterisk) {
      for (int j = 0; j < space; j++)
           System.out.print(" ");
      for (int k = 0; k < asterisk; k++)
           System.out.print("*");
    }

}
