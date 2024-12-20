import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number S1 S2 S3 S4 S5 :");
        int S1 = input.nextShort();
        int S2 = input.nextShort();
        int S3 = input.nextShort();
        int S4 = input.nextShort();
        int S5 = input.nextShort();

        int totalMarks = S1 + S2 + S3 + S4 + S5;
        float percentage = (totalMarks * 100) / 500.f;
        System.out.println("Total Marks"+totalMarks);
        System.out.println("Your percentage is:" + percentage + "%");

        if (percentage >= 90) {
            System.out.println("Grade:A+");
        } else if (percentage >= 80) {
            System.out.println("Grade:A");
        } else if (percentage >= 70) {
            System.out.println("Grade:B");
        } else if (percentage >= 60) {
            System.out.println("Grade:C");
        } else if (percentage >= 50) {
            System.out.println("Grade:D");
        } else {
            System.out.println("Failed");
        }
    }
}
