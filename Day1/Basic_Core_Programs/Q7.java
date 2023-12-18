import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        
        int num1, num2;

        System.out.println("Enter two integers");
        num1 = scannerObject.nextInt();
        num2 = scannerObject.nextInt();

        int tmp = num1;
        tmp = num1;
        num1 = num2;
        num2 = tmp;
        
        System.out.println("Values of the numbers after swapping are: " + num1 + " and " + num2);

        scannerObject.close();

    }    
}
