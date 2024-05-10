import java.util.Scanner;
public class lecture9 {
    public static void main (String args[]) {
        scanner sc= new scanner(System.in);
      // int num = sc.nextInt();
       // System.out.println("age:" +num);
        //int age =22;
       // if (num >=18){
            //System.out.println("adult:drive,vote");

       // }
       // else{
//System.out.println("not adult");
      //  }
int number = sc.nextInt() ;
if ( number %2 == 0){
    System.out.println("EVEN");

} else{
    System.out.println("odd");
}
sc.close();
    }
}