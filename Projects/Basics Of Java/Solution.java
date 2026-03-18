class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
       int strt = 0;
       int end = letters.length-1;
       int tar = (int)target;
       System.out.println("initial value :" + strt +" "+end +" "+ tar);
       return letters[ceilOfNum(letters,strt,end,tar)];
    }
    int  ceilOfNum(char arr[],int strt, int end, int tar){
        
        if(strt<=end){

        int mid = (end- strt)/2 + strt;
            System.out.println("step value :" + strt +" "+end +" "+ tar +" "+mid);

        
        if((int)arr[mid] == tar | mid == 0){
            System.out.println("arr[mid] == tar");
            return mid;
        }
        if ((int)arr[mid-1]<tar & (int)arr[mid]>tar) {
            System.out.println("arr[mid-1]<tar & arr[mid]>tar");
            return mid;
        }
        if ((int)arr[mid+1]>tar & (int)arr[mid]<tar) {
            System.out.println(" rr[mid+1]>tar & arr[mid]<tar");
            return mid+1;
        }
        if ((int)arr[mid]<tar) {
            System.out.println("arr[mid] < tar");
            return ceilOfNum(arr, mid, end, tar);
        }
        if((int)arr[mid]>tar){
            System.out.println("arr[mid] >tar");
            return ceilOfNum(arr, strt, mid, tar);
        }
    }
    return 0 ;
    }
}
 