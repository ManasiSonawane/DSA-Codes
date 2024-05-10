import java.util.*;
public class lecture9a {
    public static void main(String args[]) {
        /*Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even");

        }else{
            System.out.println("Odd");
        }*/
        
     Scanner sc = new Scanner(System.in);
     int income = sc.nextInt();
     int tax;

        if (income <500000){
            System.out.println("tax= 0");

        }else if(income>=500000 && income<=100000){
            System.out.println("tax= " +(int) (income*(0.2)));

        } else { System.out.println("tax= " + (int)(income*(0.3)));
}
    }
}
