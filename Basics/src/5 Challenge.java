import java.util.Scanner;

class Challenge3_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first no.: ");
        float firstNumber = input.nextFloat();
        System.out.println("Enter second no.: ");
        float secondNumber = input.nextFloat();
        float sum = firstNumber + secondNumber;
        int totalInt = (int) sum;
        System.out.println("Sum is :" + sum);
        System.out.println("Total is: "+totalInt);
    }
}
