import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        double temperatureInFarenheit = scannerObject.nextDouble();
        double windSpeedInMph = scannerObject.nextDouble();

        double effectiveTemperature = 35.74 + (0.6215 * temperatureInFarenheit) +  ((0.4275 * temperatureInFarenheit) * (Math.pow(windSpeedInMph, 0.16)));

        System.out.println("The Effective Temperature (Wind Chill) is: " + effectiveTemperature);

        scannerObject.close();
    }
}
