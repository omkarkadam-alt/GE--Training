import java.io.*;
import java.util.Scanner;

class Q1{
    public static void main(String[] args) {

        int coinFlipCount;
        Scanner scannerObject = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the number of times to Flip Coin (Positive Integer) : ");
            coinFlipCount = scannerObject.nextInt();

            if(coinFlipCount > 0)
                break;
        }

        final double THRESHOLD = 0.5;
        int heads = 0, tails = 0;

        for(int i = 0; i < coinFlipCount; i++)
        {
            double currentOutcome = Math.random();

            if(currentOutcome < THRESHOLD)
                tails++;
            else
                heads++;
        }

        double headsPercentage = ((double)(heads*100))/(double)(coinFlipCount);
        double tailsPercentage = ((double)(tails*100))/(double)(coinFlipCount);

        System.out.println("Percentage of heads in " + coinFlipCount + "coin flips is " + headsPercentage + " and Percentage of tails is " + tailsPercentage);

        scannerObject.close();

    }
}