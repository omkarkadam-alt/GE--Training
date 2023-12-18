import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        int N;

        while(true)
        {
            System.out.println("Enter a non-zero positive integer, N : ");
            N = scannerObject.nextInt();

            if(N > 0)
                break;
        }

        double nthHarmonicNumber = 0.0;

        for(int i = 1; i <= N; i++)
        {
            nthHarmonicNumber += ((double)(1))/((double)i);
        }

        System.out.println(N + "th harmonic number is: " + nthHarmonicNumber);

        scannerObject.close();
    }    
}
