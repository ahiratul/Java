import java.util.Scanner;
class Swap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        float a = input.nextFloat();
        System.out.println("Enter b number: ");
        float b = input.nextFloat();
        float c = a;
        a = b;
        b = c;
        System.out.println("'a' is " + a);
        System.out.println("'b' is " + b);

    }
}
