import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        int dividend;
        int divisor = 0;
        
        System.out.println("Enter the dividend: ");
        dividend = scannerObject.nextInt();

        while(divisor <= 0)
        {
            System.out.println("Enter the divisor (positive integer): ");
            divisor = scannerObject.nextInt();
        }

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        if(dividend < 0 && remainder != 0)
        {
            quotient -= 1;
            remainder += divisor;
        }
        System.out.println("Quotient and Remainder when " + dividend + " is divided by " + divisor + " is " + quotient + " and " + remainder + " respectively.");

        scannerObject.close();
    }
}
