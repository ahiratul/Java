import java.util.Scanner;

class IsPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = input.nextInt();

        if(isPrime(number)){
            System.out.println(number +" is prime.");
        }else{
            System.out.println(number+" is not prime.");
        }
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            System.out.println("1 is not prime.");
        }
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }

            return true;
        }

}
