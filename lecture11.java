import java.util.*;
public class lecture11 {
    public static void main (String args[]){
      /*/  for (int line=1;line<=4;line++){
            for ( int j=1; j<=line;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/

        //inverted star pattern
        /*int n =4;
        for (int line=1;line<=n;line++) {
            for (int s=1;s<= n-line+1;s++) {
                System.out.print("*");
            }
            System.out.println();
        }*/

        //half pyramid pattern
        /*int n = 4;
        for ( int i=1;i<=n;i++){
            for ( int j=1;j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }*/

        //print charater pattern
        int n=4;
        char ch='A';
        for ( int i=1; i<=n;i++){
            for (int j=1;j<=i;j++){
           System.out.print(ch);
           ch++;
            }
                System.out.println();
        }
  
        
    }
    
}
