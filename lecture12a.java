import java.util.*;
public class lecture12a {
   /*/ public static int multiply(int a ,int b){
     int product =a*b;
     return product;
    }
    public static void main(String args[]){
    int a=5 ;
    int b=8 ;
    int pro =multiply(a,b);
    System.out.println("product is "+ pro);*/

    //factorial
    public static int factorial(int n){
        int f=1;
        for(int i=1;i<=n;i++){
         f=f*i;
        }
        return f;
    }
    
}
