import java.util.Scanner;

public  class largest_ofThree {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First number: ");
        long f_num = input.nextLong();
        System.out.print("Enter Second number: ");
        long s_num = input.nextLong();
        System.out.print("Enter Third number: ");
        long t_num = input.nextLong();
        long largestNumber;

        if (f_num >= s_num && f_num >= t_num) {
            largestNumber = f_num;
        } else if (s_num >= f_num && s_num >= t_num) {
            largestNumber = s_num;
        } else {
            largestNumber = t_num;
        }

        System.out.println("Largest number is: " + largestNumber);
    }
}

