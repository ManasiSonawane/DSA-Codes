import java.util.*;
public class Array2{
   /* public static int linearsearch(int numbers[],int key){
        for (int i =0; i<numbers.length;i++){
            if(numbers[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main (String args[]){
        int numbers[]={2,4,6,8,10,12,14,11,16};
        int key =20;
        int index = linearsearch(numbers,key);
        if (index== -1){
            System.out.println("not found");
        }else { System.out.println("key found:"+ index);
            
    }
        }*/

        //largest number printing
        public static int getlargest(int numbers[]){
            int largest = Integer.MIN_VALUE;
            int smallest = Integer.MAX_VALUE;
            for (int i=0; i< numbers.length;i++){
                if (largest < numbers[i]){
                largest =numbers[i];
            }
            //for (int i=0 ;i> numbers.length ;i++){
                if (smallest > numbers[i]){
                    smallest = numbers[i];
                }
            }
        //}
        System.out.println("smallest value is: " + smallest);
        return largest;
    }
    public static void main (String args[]){
        int numbers[]={1,2,6,5,3};
        System.out.println("largest number value is :" +getlargest(numbers) );
    } 
}
