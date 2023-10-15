package caesarcode;
import java.util.Scanner;

public class Caesarcode {

    public static void main(String[] args) {
        // TODO code application logic here
        String plaintext;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a plaintext string: ");
            plaintext = scanner.nextLine().toUpperCase();
        }

        int shift = 3; // The shift value (in this case, n=3)

        String ciphertext = encrypt(plaintext, shift);
        System.out.println("The ciphertext string is: " + ciphertext);
    }

    public static String encrypt(String plaintext, int shift) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                // Shift the letter by the specified shift value
                char shiftedChar = (char) ((ch - 'A' + shift) % 26 + 'A');
                result.append(shiftedChar);
            } else {
                // If not a letter, keep it unchanged
                result.append(ch);
            }
        }

        return result.toString();
    }
}


    
    

