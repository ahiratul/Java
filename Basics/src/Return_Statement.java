import java.util.Scanner;

public class Return_Statement {
    public static void main(String[] args) {
        System.out.println("Use of return statement.");
        int first = readNumber();
        int second = readNumber();
        int sum = first + second;
        System.out.println(+sum);

    }

    public static int readNumber() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        return number;
    }
}
