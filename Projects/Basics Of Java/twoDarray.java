public class twoDarray {
    public static void main(String[] args) {
        
        // int[][] arr = new int[3][];
        // arr[1][0] = 2;
        int[][] arr ={
            {1,2,3},
            {1},
            {1,2,3,4}
        };//int tis datatype arr is array itself
        // System.out.println(arr[1][0]);
        for (int[] elem : arr) {
            for (int num : elem) {
                System.out.println(num);
            }
        }
    }
}
