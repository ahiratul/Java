import java.util.Scanner;

class simple_interest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter principal amount: ");
        double principal_amount = input.nextDouble();
        System.out.print("Enter time in years: ");
        float years = input.nextFloat();
        System.out.print("Enter rate of interest:");
        double rate = input.nextDouble();
        double interest = (principal_amount * rate* years) / 100;
        System.out.print("Simple interest is Rs:" + interest);
    }
}
