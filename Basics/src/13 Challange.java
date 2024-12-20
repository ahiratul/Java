import java.util.Scanner;

class OddNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Number:");
        long number = input.nextLong();

        if (number > 0) {
            if (number % 2 == 0) {
                System.out.print("Number is positive and even.");
            } else {
                System.out.println("Number is positive and odd.");
            }
        }
        if (number < 0) {
            if (number % 2 == 0) {
                System.out.println("Number is negative and even.");
            } else {
                System.out.println("Number is negative and odd.");
            }
        }
        if (number == 0) {
            System.out.println("Zero is not  either positive or negative and it is a even number.");
        }
    }
}
