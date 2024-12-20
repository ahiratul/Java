import java.util.Scanner;

class parameter_Rectangle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter length : ");
        int length = input.nextInt();
        System.out.println("Enter breadth : ");
        int breadth = input.nextInt();
        int parameter = 2 * (length + breadth);
        System.out.println("parameter of rectangle is: " + parameter);

        //Scanner input = new Scanner(System.in);
        //        System.out.println("Enter the values for a, b, c, and d (separated by spaces): ");
        // Read all four values in one line
        //        int a = input.nextInt();
        //        int b = input.nextInt();
        //        int c = input.nextInt();
        //        int d = input.nextInt();
        //
        //        // Assuming you want to calculate the perimeter of a rectangle (a and b are length and breadth)
        //        int perimeter = a + b + c + d;
        //
        //        // Display the result
        //        System.out.println("The perimeter of the rectangle is: " + perimeter);
        //    }
    }

}
