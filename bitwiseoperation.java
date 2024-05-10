import java.util.*;
public class bitwiseoperation{
    public static void oddoreven(int n){
        int bitmask = 1;
        if ((n& bitmask) == 0 ){//even number 
     System.out.println("even number");
    }else {
        System.out.println("odd number");
    }
}
public static int getIthbit(int n ,int i){
    int bitmask =1<<i;
    if ((n& bitmask)==0){
        return 0;
    }
    else {
        return 1;
    }
}
public static int setithbit(int n,int i){
    int bitmask=(1<<i);
    return n|bitmask;

}
public static int clearithbit(int n,int i){
    int bitmask=~(1<<i);
    return n & bitmask;
}
public static int updateithbit(int n , int i, int newbit){
    /*if (newbit ==0){
        return clearithbit(n,i);
    }else {
        return setithbit(n,i);
    }*/
     n = clearithbit(n,i);
    int bitmask = newbit<<i;
    return n| bitmask;
  
}
public static int lastithbit(int n,int i){
    int bitmask =((~0)<<i);
    return n & bitmask;

}
public static int clearibitsrange(int n,int i,int j){
   int a=((~0)<<(j+1));
   int b =(1<<i)-1;
   int bitmask = a|b;
   return n & bitmask;
}
public static boolean ispoweroftwo(int n){
    return (n & (n-1))==0;
}
public static int countsetbits(int n){
    int count = 0;
    while (n>0){
        if ((n&1)!=0){//check our lsb
            count ++;
        }
        n = n>>1;

    }
    return count;
}
public static int fastexpo(int a , int n){
int ans =1;
while (n>0){
    if ((n&1)!=0){//check lsb
    ans =ans *a;
}
a = a*a;
n=n>>1;

}
return ans;
}
    public static void main (String args[]){
        /*System.out.println((5&6));
        System.out.println((5|6));
        System.out.println((5^6));
        System.out.println((~5));
        System.out.println((5<<2));
        System.out.println((6>>1));*/
        //oddoreven(3);
        //oddoreven(6);
        //oddoreven(11);
        System.out.println(getIthbit(10 ,2));
        System.out.println(setithbit(10 ,2));
        System.out.println(clearithbit(10 ,2));
        System.out.println(updateithbit(10 ,2,1));
        System.out.println(lastithbit(15 ,2));
        System.out.println(clearibitsrange(10 ,2,4));
        System.out.println(ispoweroftwo(8));
        System.out.println(countsetbits(10));
        System.out.println(fastexpo(5,3));

    }
}