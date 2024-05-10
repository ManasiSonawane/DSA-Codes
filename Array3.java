import java.util.*;
// binary search
public class Array3{
    // binary search
    /*public static int binarysearch(int numbers[],int key){
     int start =0, end =numbers.length - 1;
     while (start<=end ){
        int mid =(start+end)/2;

        // comparisions
        if (numbers[mid] == key){
            return mid;
        }
        if (numbers[mid]<key){
            start = mid +1;
        }
         else {
            end = mid -1;
         }
     }
     return -1;
    }
    public static void main (String args[]){
    int numbers[]={2,4,6,8,10,12,14};
    int key = 10;
    System.out.println("index for key is :" + binarysearch(numbers,key));
    }*/



    //Reverse an array

    public static void reverse(int numbers[]){
        int first =0, last = numbers.length-1;
        while (first<last){
            //swap
            int temp = numbers[last];
            numbers[last]=numbers[first];
            numbers[first]= temp;
            first ++;
            last --;
        }
    }
    public static void main (String args[]){
        int numbers[]={2,4,6,8,10,12,14};
        reverse(numbers);
        for (int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+ " ");
        }
        System.out.println();
    }
}