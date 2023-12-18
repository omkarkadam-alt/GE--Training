import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Provide values for a, b and c to find Quadtatic roots: ");
        double a = scannerObject.nextDouble();
        double b = scannerObject.nextDouble();
        double c = scannerObject.nextDouble();

        double delta = (b * b) - (4.0 * a * c);

        boolean imaginaryRoots = (delta < 0);
        if(imaginaryRoots)
            delta *= -1.0;

        double root1 = ((-b) + (Math.pow(delta, 0.5)))/(2.0 * a);
        double root2 = ((-b) - (Math.pow(delta, 0.5)))/(2.0 * a);

        if(!imaginaryRoots)
        {
            System.out.println("Roots for the gievn quadratic equation are: " + root1 + " and " + root2);
        }
        else
        {
            // has imaginary roots
            System.out.println("Roots for the gievn quadratic equation are: " + ((-b)/(2.0 *a)) + " + i" + ((Math.pow(delta, 0.5))/(2.0 * a)) + " and " + ((-b)/(2.0 *a)) + " - i" + ((Math.pow(delta, 0.5))/(2.0 * a)));
        }
        scannerObject.close();
    }    
}
