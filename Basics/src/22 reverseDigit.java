import java.util.Scanner;

class reverseDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number:");
        int number = input.nextInt();

        int reverseNum=reverseNumber(number);
        System.out.println(+reverseNum);

    }
    public static int reverseNumber(int number){
        int reverseNum=0;
        while (number!=0){
            int digit=number%10;// extract the first digit
            reverseNum=reverseNum*10+digit;
            number/=10;// remove the last digit from number
        }
       return reverseNum;
    }
}
