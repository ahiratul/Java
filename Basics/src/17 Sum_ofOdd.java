import java.util.Scanner;

class Sum_ofOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no.");
        int number = input.nextInt();
        int sum = oddNumbers(number);
        System.out.println("\nThe sum od all odd number up to " + number + " is:" + sum);

    }

    public static int oddNumbers(int number) {
        int sum = 0;
        System.out.print("The odd numbers are: ");
        for (int i = 1; i <= number; i++) {
            if (i % 2 != 0) {
                System.out.print(+ i+" ");
            }
            sum += i;
        }
        return sum;
    }
}
