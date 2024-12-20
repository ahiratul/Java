import java.util.Scanner;

 class Sum_ofDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no.");
        int number = input.nextInt();
        int org_num=number;
        int sum=0;

        while (number!=0){
            int digit=number%10;// extract the first digit
            sum+=digit;
            number/=10;// remove the last digit from number
        }
        System.out.println("Sum of all digit till "+org_num+" is "+sum);
    }
}
