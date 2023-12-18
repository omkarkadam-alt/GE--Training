import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        int N;

        while(true)
        {
            System.out.println("Enter a non-negative integer, N: ");
            N = scannerObject.nextInt();

            if(N >= 0)
                break;
        }

        

        if(N == 0 || N == 1)
        {
            System.out.println("Prime factors for " + N + " do not exist.");
        }
        else
        {
            System.out.print("Prime factors for " + N  + " are:");
            
            int currN = N;
            for(int i = 2; i*i <= N; i++)
            {
                while(currN % i == 0)
                {
                    System.out.print(" " + i);
                    currN /= i;
                }
            }
        }

        System.out.println();

        scannerObject.close();
    }
}
