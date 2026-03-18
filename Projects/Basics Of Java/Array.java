
import java.util.ArrayList;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /*
        syntax :
        datatype[] variable_name = new datatype[size];
        */
        // int[] rnos = new int[5];
        // //or
        // int[] rnos2 ={2,3,4,5};

        /*
        int[] ros //just decleration , ros is getting the datatype
        ros =  new int[5]; //creating the object in heap;
        
        new is used to create an object ; it will create a meamory in heaep
        */

        // System.out.println("" + rnos[0]);
        // String[] name = new String[4];
        // System.out.println(name[1]);
        /*
        why it shows null ?
        solun : So the java is object oriented programming , so new string[4]
        will create 4 object with names name[0],name[1],name[2],name[3];
        So initially they are pointing to nothing, so ,they are to poining to null
        as soon as we declare the value the , value is stored in the cell allocated to that objec
        So till there is no value for refrence value ,there is null
        */




        // int[] arr = new int[5];
        Scanner in = new Scanner(System.in);
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = in.nextInt();
        // }

        // System.out.println("Array : " + Arrays.toString(arr));
        // for (int num : arr) {
        //     System.out.print(" "+ num);
        // }

        // String[] str = new String[5];
        // for (int i = 0; i < 5; i++) {
        //     str[i] = in.next();
        // }
        // System.out.println("Array : " + Arrays.toString(str));

        //if we dont know the size of our array , we use array list , its like vactor of c++
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10);
        list.add(0,7);
        list.add(1, 8);

        System.out.println(list);
        System.out.println(list.get(1));//list[index] wont work here;
        



    }
}
