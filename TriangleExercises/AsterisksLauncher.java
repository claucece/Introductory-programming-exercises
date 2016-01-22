public class AsterisksLauncher {    

    public static void main (String[] args) {
        System.out.println("Let's print asterisks in various ways:");
        Asterisks multipleAsterisks = new Asterisks();
        multipleAsterisks.drawMultiple(1);
        System.out.println();
        multipleAsterisks.drawMultiple(3);
        System.out.println();
        multipleAsterisks.drawInLines(5);
        System.out.println();
        multipleAsterisks.drawTriangle(7);
    }

}
