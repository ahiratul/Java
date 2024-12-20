public class Array {
    public static void main(String[] args) {
        int[] array_num = {1, 3, 4, 5, 5,};
        System.out.println(array_num[4]);
        array_num[2] = -5;
        System.out.println(array_num[2]);

        int[] _array = new int[5];
        _array[1] = 8;
        _array[0] = 5;
        _array[2] = 3;
        _array[4] = 2;
        _array[3] = 1;
        System.out.println("Array length is: " + _array.length);
        for (int j : _array) {
            System.out.print(j + "\t");
        }
    }
}
