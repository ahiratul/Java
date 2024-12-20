import java.util.Scanner;

class OddEvenBitwise {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int number= input.nextInt();

        if((number & 1)==1){
            System.out.println("Your number is odd.");
        }else{
            System.out.println("Your number is even.");
        }
    }
}
