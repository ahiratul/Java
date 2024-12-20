import java.util.Scanner;

class Multiply {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the no.");
        int number= input.nextInt();
        multiply(number);

    }
    public static void  multiply(int number){
        for(int i=1;i<=10;i++){
            System.out.println(number+"x"+ i +"="+(number*i));
        }
    }
}
