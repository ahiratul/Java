public class Parameter {
    public static void main(String[] args ){
        int num= sum(4,5);//// argument actual value is passed.
        System.out.println(+num);
    }

    public static int sum(int first,int second){
        System.out.println("First number received:" +first);
        System.out.println("First number received:" +second);
          return first+second;
    }
}