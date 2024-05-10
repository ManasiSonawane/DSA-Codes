import java.util.*;

public class Strings{
    public static void printletters(String str){
        for (int i=0; i<str.length() ; i++){
            System.out.print(str.charAt(i)+ " ");
            
    
        }
        System.out.println();
    }
    public static boolean palindrome(String str){
        for (int i=0;i<str.length()/2 ; i++){
            int n = str.length();
            if (str.charAt(i)!=str.charAt(n-1-i)){//not a palindrome

                return false;
            }

        }
        return true;
    }
    public static float getshortestPath(String path){
      int x =0 ,y=0;
      for (int i=0 ; i< path.length(); i++){
        char dir =path.charAt(i);
        if (dir == 'S'){
            y--;
        }
        else if (dir=='N'){
            y++;
        }
       else if (dir == 'E'){
            x++;
        }
        else //(dir == 'W')
        {
            x--;
        }
      }
      int X2 = x*x;
      int Y2 = y*y;
      return (float)Math.sqrt(X2 +Y2);// typecast in float
    }
    public static String substring(String str , int si,int ei){
        String substr="";
        for ( int i=si;i<ei ;i++){
            substr +=str.charAt(i);

        }
        return substr;
    }
    public static void main (String args[]){
       /* char arr[]={'a','b','c','d'};
        String str ="abcd";
        String str2 = new String("xyz"); 
        Scanner sc = new Scanner (System.in);
        String name;
        name =sc.nextLine ();
        System.out.println(name);*/
        //String fullName ="manasi sonawane";
       // System.out.println(fullName.length());//to calculate length use function .length
        //concatanation
         //String firstName ="manasi";
         //String lastName="Sonawane";
         //String fullName = firstName+" " +lastName;
         //String str = "racecar";
         //System.out.println(fullName.charAt(0));
       
        // printletters(fullName);
        // System.out.println(palindrome(str));
        /* String path =" WNEENESENNN";
         System.out.println(getshortestPath( path));*/
        // String str ="hello world";
         //System.out.println(str.substring(0,5));//inbuilt function in java for substring
         //System.out.println(substring( str , 0,5));
         String fruits[]={"apple","mango","banana"};
         String largest= fruits[0];
         for (int i=1; i<fruits.length;i++){
          if ( largest.compareTo(fruits[i])<0){
            largest = fruits[i];
          }
         }
         System.out.println(largest);
    }
}