import java.util.Scanner;

class GCD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the num1 num 2: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int gcd_num = gcd(num1, num2);
        System.out.println("GCD of " + num1 + " " + num2 + " is: " + gcd_num);
    }

    public static int gcd(int num1, int num2) {
        int i = 1;
        int gcd = 1;
        while (i <= num2) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
            i++;
        }
        return gcd;

//        int gcd = 1; // Start with 1 as the minimum GCD
//        int limit = Math.min(num1, num2); // GCD cannot exceed the smaller number
//        for (int i = 1; i <= limit; i++) {
//        A variable named limit is declared of type
//        int to store the result of Math.min(num1, num2).//
//            if (num1 % i == 0 && num2 % i == 0) {
//                gcd = i; // Update GCD
//            }
//        }
//        return gcd;
    }
}
