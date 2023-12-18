import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int num1 = scannerObject.nextInt(), num2 = scannerObject.nextInt(), num3 = scannerObject.nextInt();

        if(num1 >= num2 && num1 >= num3)
        {
            System.out.println(num1 + " is greatest among the given three numbers.");
        }
        else
        {
            if(num2 >= num1 && num2 >= num3)
            {
                System.out.println(num2 + " is greatest among the given three numbers.");
            }
            else
            {
                System.out.println(num3 + " is greatest among the given three numbers.");
            }
        }

        scannerObject.close();
    }
}
