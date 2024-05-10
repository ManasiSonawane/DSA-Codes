import java.util.*; 
public class lecture12new {
   
    */
   public static int factorial(int n){
       int f=1;
       for (int i=1;i<=n;i++) {
        f = f * i;
       }
       return f;
    }
    public static void main (String args[]){
       System.out.println(factorial(4));
    }
    @Override
    public String toString() {
        return "lecture12new []";
    }

}