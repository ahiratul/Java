public class typeConversion {
    public static void main(String [] args){
    float myPrice = 3;//Implicit conversion happens automatically when a smaller data type is assigned to a larger data type
    System.out.println(myPrice);

    int myInt=(int) 5.95;// Explicit manually cast a larger data type to a smaller data type
    System.out.println(myInt);

    }
}
