public class Function {
    public static void main(String[] args) {
        int rows = 5;
        print_triangle(rows);
        revStar();
    }

    public static void print_triangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void revStar() {
        int i = 5;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }

}

