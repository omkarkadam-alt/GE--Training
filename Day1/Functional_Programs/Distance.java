import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter x and y: ");
        int x = scannerObject.nextInt();
        int y = scannerObject.nextInt();

        double euclideanDistance = Math.pow((Math.pow(x, 2) + Math.pow(y, 2)), 0.5);

        System.out.println("Euclidean distance from (" + x + "," + y + ") to (0, 0) is " + euclideanDistance);

        scannerObject.close();
    }
}
