import java.util.*;
public class lecture12 {
public static void printHelloWorld(){
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
}
 public static void calculateSum(int a,int b){//parameters
   
     int sum =a+b;
     System.out.println("Sum is" + sum);
 }
    public static void main(String args[]){
     // printHelloWorld();//function call
     Scanner sc =new Scanner(System.in);
     int a =sc.nextInt();
     int b =sc.nextInt();
     calculateSum(a,b);//arguments

    }
}
