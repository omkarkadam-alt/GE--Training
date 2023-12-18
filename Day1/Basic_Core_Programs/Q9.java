import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter a character(valid character in alphabet): ");
        char inputCharacter = scannerObject.next().charAt(0);

        if(inputCharacter == 'A' || inputCharacter == 'a' || inputCharacter == 'E' || inputCharacter == 'e' || inputCharacter == 'I' || inputCharacter == 'i' || inputCharacter == 'O' || inputCharacter == 'o' || inputCharacter == 'U' || inputCharacter == 'u')
        {
            System.out.println("Given character, " + inputCharacter + ", is a vowel.");
        }
        else
        {
            System.out.println("Given character, " + inputCharacter + ", is a consonant.");
        }

        scannerObject.close();
    }
}
