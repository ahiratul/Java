import java.util.Scanner;

public class DrivingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("You have a licence?(Y/N): ");
        char hasLicence = scanner.next().toUpperCase().charAt(0);//extracts the first character: 'Y'.
        if (age >= 18 && hasLicence == 'Y') {
            System.out.println("You can Drive.");
        } else if (age >= 18 && hasLicence == 'N') {
            System.out.println("Get a Licence");
        } else {
            System.out.println("You are a Teenager.\n\"Thank You.\"");
        }

    }

}
