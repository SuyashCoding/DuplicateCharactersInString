import java.util.Scanner;

/**
 * duplicate characters in a string
 * @author Suyash Patel
 */
public class DuplicateCharactersInString {

    /**
     * finds duplicate chracters in a string
     * @param string string to find duplicated chracters
     */
    public static void printDuplicateCharacters(String string) {
        string = string.toLowerCase();
        String duplicates = "";

        for (int i = 0; i < string.length(); i ++) {
            char character = string.charAt(i);

            if (string.indexOf(character, i + 1) != -1) {
                if (duplicates.indexOf(String.valueOf(character)) == -1) {
                    duplicates = duplicates + character + " ";
                }
            }
        }
        System.out.println("Duplicate characters are: " + duplicates);
    }

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String string = scanner.nextLine();
        printDuplicateCharacters(string);
        scanner.close();
    }
}
