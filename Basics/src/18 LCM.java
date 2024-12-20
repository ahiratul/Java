
import java.util.Scanner;

class LCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no1  no2.");
        int num1 = (short) input.nextInt();
        int num2 = (short) input.nextInt();
        int lcmIs=lcm(num1,num2);
        System.out.println("LCM of "+num1 +" and "+num2+" is:"+lcmIs);

    }

    public static int lcm(int num1, int num2) {
        int i = 1;
        while (i <= num2) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }
        return 0;
    }

}


