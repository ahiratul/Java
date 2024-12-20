import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no.");
        int number = input.nextInt();
        factorial(number);
    }

    public static void factorial(int number) {
        if (number == 1 || number == 0) {
            System.out.println("Factorial of " + number + " is 1.");
        }
            long factorial = 1;
            int i = 2;
            while (i <= number) {
                factorial *= i;
                i++;
            }
            System.out.println("Factorial of " + number + " is " + factorial);
    }
}
