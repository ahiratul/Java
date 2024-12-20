import java.util.Scanner;

 class PalindromeNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int number = input.nextInt();

        int reverseNum = findPalindrome(number);
        if (reverseNum == number) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }

    public static int findPalindrome(int number) {
        int reverseNum = 0;
        while (number != 0) {
            int digit = number % 10;
            reverseNum = reverseNum * 10 + digit;
            number /= 10;
        }
        return reverseNum;
    }
}
