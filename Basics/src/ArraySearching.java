import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array: ");
        int n = input.nextInt();
        int[] marks = new int[n];
        StoreArray(input, n, marks);
        System.out.println("Enter array you want to search");
        int value = input.nextInt();
        if(isFound(marks, value)) {
        System.out.println("Element is found in array.");
        } else System.out.println("Element isn't found in array.");
    }

    public static void StoreArray(Scanner input, int n, int[] marks) {
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            marks[i] = input.nextInt();
        }
    }

    public static boolean isFound(int[] marks, int value) {
        for ( int n = 0;n < marks.length;n++){
            if(marks[n]==value){
            return true;}
        }
            return false;
        }
    }

