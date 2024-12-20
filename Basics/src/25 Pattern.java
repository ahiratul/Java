class Pattern {
    public static void main(String[] args) {
        int rows = 1;
        while (rows <= 5) {
            int i = 1;
            while (i <= rows) {
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows++;
        }
        System.out.println("\n");
        R_rightHalf();
        LeftHalfPyramid();
        leftHalfPyramid();
        R_LeftHalfPyramid();
    }

    public static void R_rightHalf() {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void R_LeftHalfPyramid() {
        int rows = 1;
        while (rows <= 5) {
            int j = 1;
            while (j < rows) {
                System.out.print(" ");
                j++;
            }
            int i = 1;
            while (i <= (6 - rows)) {
                System.out.print("*");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

    public static void LeftHalfPyramid() {
        int rows = 5;
        int currentRow = 1;
        while (currentRow <= rows) {
            int spaces = rows - currentRow;
            // Print spaces
            int j = 0;
            while (j < spaces) {
                System.out.print(" ");
                j++;
            }
            // Print stars
            int star = 1;
            while (star <= currentRow) {
                System.out.print("*");
                star++;
            }

            System.out.println();
            currentRow++;
        }
        System.out.println("\n");
    }

    public static void leftHalfPyramid() {
        int rows = 1;
        while (rows <= 5) {
            int j = 0;
            // Print  spaces
            while (j < 5 - rows) {
                System.out.print(" ");
                j++;
            }

            int i = 1;
            // Print stars
            while (i <= rows) {
                System.out.print("*");
                i++;
            }

            System.out.println();
            rows++;
        }
        System.out.println("\n");
    }
}