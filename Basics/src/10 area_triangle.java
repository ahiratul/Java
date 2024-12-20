import java.util.Scanner;

class area_triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the breadth: ");
        double breadth = input.nextDouble();
        System.out.print("Enter the height: ");
        double height = input.nextDouble();
        double area = 0.5 * breadth * height;
        float Area= (float)area;
        System.out.println("Area is: "+Area);
    }
}
