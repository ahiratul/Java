import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.print("Enter your weight in kg: ");
        int weight = input.nextInt();

        System.out.println("Enter your height in meter");
        float height = input.nextFloat();

        if (age >= 80) {
            System.out.println("You can't donate blood, you are too old. Thank you.");
        } else if (age >= 18) {
            if (weight >= 50) {
                System.out.println("You can donate blood.");
            } else {
                System.out.println("You can't donate blood, your weight is less.");
            }
        } else {
            System.out.println("You are a teenager.");
        }

        printBMI(weight, height);
        input.close();
    }

    public static void printBMI(int weight, float height) {
        double bmi = weight / (height * height);
        System.out.printf("Your BMI is: %.2f%n", bmi);
    }
}
