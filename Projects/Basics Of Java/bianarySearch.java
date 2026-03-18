public class bianarySearch {



    static int  binary(int arr[],int strt, int end, int tar){
        int mid = (end- strt)/2 + strt;
        if(strt<=end){
        if(arr[mid] == tar){
            return mid;
        }
        if (arr[mid]<tar) {
            return binary(arr, mid+1, end, tar);
        }
        if(arr[mid]>tar){
            return binary(arr, strt, mid-1, tar);
        }
    }
        return -1;
    }
    // static  void ceilOfNum(int[] arr, int target){
    //     start = 
    // }
    
    static int  ceilOfNum(int arr[],int strt, int end, int tar){
        if(strt<=end){
        int mid = (end- strt)/2 + strt;

        if(arr[mid] == tar){
            // System.out.println("arr[mid] == tar");
            return mid;
        }
        if (arr[mid-1]<tar & arr[mid]>tar) {
            // System.out.println("arr[mid-1]<tar & arr[mid]>tar");
            return mid-1;
        }
        if (arr[mid+1]>tar & arr[mid]<tar) {
            // System.out.println(" rr[mid+1]>tar & arr[mid]<tar");
            return mid;
        }
        if (arr[mid]<tar) {
            // System.out.println("arr[mid] < tar");
            return ceilOfNum(arr, mid, end, tar);
        }
        if(arr[mid]>tar){
            // System.out.println("arr[mid] >tar");
            return ceilOfNum(arr, strt, mid, tar);
        }
    }
    return -1 ;
    }

    public static void main(String[] args) {
        char[] letters = {'x','x', 'y', 'y'};
        char target = 'z';

        Solution s = new  Solution();
        char ans = s.nextGreatestLetter(letters, target);
        System.out.println("Ans is " + ans);

    }
}
