import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scannerObject.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even.");
        else
            System.out.println(num + " is odd.");

        scannerObject.close();
    }    
}
