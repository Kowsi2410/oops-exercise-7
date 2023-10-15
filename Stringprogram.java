
package stringprogram;
import java.util.Scanner;
public class Stringprogram {

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        String email = generateEmail(firstName, lastName);
        System.out.println("Generated Email Address: " + email);
    }

    private static String generateEmail(String firstName, String lastName) {
        String firstPart = firstName.substring(0, Math.min(firstName.length(), 3)).toLowerCase();
        String secondPart = lastName.substring(0, Math.min(lastName.length(), 4)).toLowerCase();
        return firstPart + "." + secondPart + "@example.com"; // Change 'example.com' to your domain
    }
}

