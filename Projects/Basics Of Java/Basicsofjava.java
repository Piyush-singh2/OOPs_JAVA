
import java.util.Scanner;
import java.util.function.Function;



public class Basicsofjava {
    static  Scanner input(){
        Scanner in = new Scanner(System.in);
        return in;
    }
    int countNum(int n,int tar){
        int rem;
        int count=0;
        while(n !=0){
            rem = n%10;
            n=n/10;
            if (rem == tar) count++;
        }
        return count;
    }
    int revseNum(int n){
        int temp=0;
        int rem;
        while (n!=0) {
            rem = n%10;
            n= n/10;
            temp = temp*10 +rem; 
        }
        return temp;
    }
    void expScope(int n){
        int temp;
        //what ever changes we do to temp will be valid in this method scope only we can not acces it from main() method
        {
           // int temp =76; this will give error as its already defined in respect to this block;
           int c =0; //however if we define c over here , it will be vallid in this block only;
        }
        int c =6; //here we can define again;

    }
    static void fun (int ...v){
        int n = v;

    }
    static void overloading(){
        //two function with same name but different type or number of arguement
        // so compiler decides at run time to whichh method to call , based on arguements;
        /*
        
        fun();
        fun(int a, int b);
        fun(int ...v);
        fun(int a, string b);


        so all have same name , so based on arguement we dcide which one to call;
        

        
        */
    }



    static  int fibonaci(int n){
        if(n == 1 || n == 0){
            return n;
        }else{
            return fibonaci(n-1)+fibonaci(n-2);
        }
    }
    public static void main(String[] args) {
        Basicsofjava obj = new Basicsofjava();
        int n =input().nextInt();
        int ans = obj.revseNum(n);
        System.out.println("NUmber of ocuurance is : "+ans);
    }
}
