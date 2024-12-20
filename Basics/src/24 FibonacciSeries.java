import java.util.Scanner;

 class FibonacciSeries {
     public static void main(String[] args) {
         Scanner input =new Scanner(System.in);
         System.out.println("Enter number up to which you want fibonacci series:");
         int number= input.nextInt();
         System.out.println("Fibonacci Series is: ");
         fibonacciSeries(number);
     }
     public static void  fibonacciSeries(int number){
         if(number<0) return;
         System.out.print("0 ");
         if(number==0) return;
         System.out.print("1 ");
         int num1=0, num2=1;
        while(num1+num2<=number) {
            int third = num1 + num2;
            System.out.print(third +" ");
            num1 = num2;
            num2 = third;
        }

     }
}
