import java.util.*;
public class lecture10b {
    public static void main (String args[]){
       /*/ int counter =1;
        do{
            System.out.println("hello world");
            counter++;
        } while(counter<=10);*/

        //using break keep entering number until multiple of 10
/*Scanner sc=new Scanner(System.in);

       do {
        System.out.print("Enter you number:");
        int n =sc.nextInt();
        if (n%10 ==0){
            break;
        }
        System.out.println(n);
       }while (true);*/

       //continue statement
      /*  for (int i=1;i<=5; i++){
        if(i==3) {
            continue;
        }
        System.out.println(i);
       }*/


       //display all num entered by user except number 10

       Scanner sc=new Scanner(System.in);

       do {
        System.out.println("enter your number:");
        int n =sc.nextInt();

        if (n% 10==0 ){
            continue;
        }
        System.out.println("number was :" +n);
       }while (true);
    }
    
}
