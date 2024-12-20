import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter temperature in F:");
        float f_temperature =input.nextFloat();

        float celsius = (f_temperature-32)*5/9;
        System.out.println("Temp  is:"+celsius+"°C");
    }
}
