package java;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckingPangramOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine().toLowerCase(); // Convert to lowercase for case-insensitivity

        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The entered sentence is a pangram.");
        } else {
            System.out.println("The entered sentence is not a pangram.");
        }

        scanner.close();
    }

    public static boolean isPangram(String s) {
        Set<Character> uniqueCharacters = new HashSet<>();

        for (char c : s.toCharArray()) {
            if (Character.isLetter(c)) {
                uniqueCharacters.add(c);
            }
        }

        return uniqueCharacters.size() == 26;
    }
}
