import java.util.*;
public class lecture9c {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no a =");
        int a =sc.nextInt();
        System.out.println("enter no b =");
        int b =sc.nextInt();
        System.out.println("enter operator=");
   char operator = sc.next().charAt(0);
    switch(operator){
        case '+' : System.out.println(a+b);
        break;
        case '-' : System.out.println(a-b);
        break;
        case '/' : System.out.println(a/b);
        break;
        case '*' : System.out.println(a*b);
        break;
        case '%' : System.out.println(a%b);
        break;
        default: System.out.println( "not that advanced");
        break;
    }
    }
}