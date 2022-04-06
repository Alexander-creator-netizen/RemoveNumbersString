import java.util.Scanner;

/**
 * This programm removes numbers from the entered string.
 * @data 06.04.2022
 * @author Alex Krentik
 */

public class RemoveNumbersString {
    public static void main(String[] args) {
        Scanner inputString = new Scanner(System.in);
        System.out.println("Write a phrase containing numbers: ");
        String stringWithNumbers = inputString.nextLine();
        System.out.println("String without numbers: ");
        for (int i = 0; i < stringWithNumbers.length(); i++) {
            char characterInString = stringWithNumbers.charAt(i);
            if (!Character.isDigit(characterInString)) {
                String newString = Character.toString(characterInString);
                System.out.print(newString);
            }
        }
    }
}
