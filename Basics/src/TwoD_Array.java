public class TwoD_Array {
    public static void main(String[] args){
        int [][] arr={{1,5,4},{2,6,5,8}};
        System.out.println("Length is: "+arr[0].length);

        int i=0;
        while(i<arr.length){
            int j=0;
            while (j<arr[i].length){
                System.out.print(arr[i][j]+" ");
               j++;
            }
            System.out.println();
            i++;
        }
    }
}
