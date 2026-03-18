


public class LinearSearch {
    static int search(int[] v,int tar){
        for (int i = 0; i < v.length; i++) {
            if(v[i]==tar) return i;
        }
        return -1;
    }

    static int evenNodigit(int[] arr){
        int noOfDigit =0;
        for (int elem : arr) {
            if(((int)Math.log10(Math.abs(elem))+1)%2 == 0) noOfDigit++;
        }
        return noOfDigit;
    }


    public static void main(String[] args) {
        int[] arr ={1,-23,345,333,324234,4323,4322,42};
        System.out.println("No of even digit numbers : " + evenNodigit(arr));
    }
    
    }
