import java.util.Scanner;

class ArmstrongNUmber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no.");
        int number = input.nextInt();

        if(Is_armstrong(number)){
            System.out.println(number+" is an armstrong number.");
        }else{
            System.out.println(number+" is not an armstrong number");
        }
    }

    public static int count(int number) {
        int count = 0;
        number = Math.abs(number);
        do {
            count++;
            number /= 10;
        } while (number > 0);
        return count;
    }

    public static boolean Is_armstrong(int number) {
        double num = 0;
        int org_num=number;
        int digit_count = count(number);
        while (number != 0) {
            int digit = number % 10;
            num += Math.pow(digit, digit_count);
            number /= 10;
        }
        return num==org_num;
    }

}
