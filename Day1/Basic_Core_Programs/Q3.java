import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter an integer, N: ");
        int N = scannerObject.nextInt();

        for(int i = 0; i <= N; i++)
        {
            System.out.println((int)Math.pow(2, i));
        }

        scannerObject.close();
    }
}
