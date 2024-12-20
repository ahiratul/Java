import java.util.Scanner;
public class Variables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");

        int age = scanner.nextInt();

        if (age < 13){
            System.out.println("You are an teenager.");
        }
        else if (age < 18) {
            System.out.println("You are a Adult.");
        }
        else if (age < 60) {
            System.out.println("You are a Senior Citizen.");
        }
    }
}

