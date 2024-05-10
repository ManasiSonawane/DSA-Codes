import java.util.*;
public class lecture10a {
    public static void main (String args []){
        /*for (int i=1;i<=4;i++) {
            System.out.println("****");
        }*/
        //while loop
       /*  int i=1;
        while ( i<=4){
            System.out.println("****");
            i++;
        }*/

        //reverse of numbers
        /*int n=10899;
        while (n>0){
            int lastDigit=n%10;
            System.out.println(lastDigit);
            n=n/10;
        }
        System.out.println();*/

        //reverse the given number
        int n =10096;
        int rev =0;
        while (n>0){
            int lastdigit=n%10;
            rev=(rev *10) + lastdigit;
            n=n/10;
            
        }
        System.out.println(rev);

    }
    
}
