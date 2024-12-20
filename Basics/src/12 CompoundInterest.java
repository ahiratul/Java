import java.util.Scanner;
class CompoundInterest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter principle amount ₹:");
        double principal_amount = input.nextDouble();
        System.out.print("Enter time in years: ");
        float years = input.nextFloat();
        System.out.print("Enter rate of interest:");
        double rate = input.nextDouble();

        double compound_Interest=principal_amount*Math.pow((1+rate/100),years);
        System.out.printf("Compound interest is ₹%.2f%n",compound_Interest);// limit decimal values at two
    }
}
