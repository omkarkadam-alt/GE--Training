import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        
        Scanner scannerObject = new Scanner(System.in);
        int inputYear;

        while(true)
        {
            System.out.println("Enter a year (4 digit) : ");
            inputYear = scannerObject.nextInt();

            if(inputYear >= 1000 && inputYear <= 9999)
                break;
        }


        if((inputYear % 4 == 0 && inputYear % 100 != 0) || (inputYear % 4 == 0 && inputYear % 100 == 0 && inputYear % 400 == 0))
        {
            System.out.println(inputYear + " is a leap year");
        }
        else
        {
            System.out.println(inputYear + " is not a leap year");
        }

        scannerObject.close();

    }
}
