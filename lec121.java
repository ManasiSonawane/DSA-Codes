//function to cal int sum 
public class lec121{
public static int sum(int a,int b){
    return a+b;
}
// fun to cal float sum 
public static float sum (float a ,float b){
    return a+b ;
}
public static boolean isPrime(int n){
    boolean isPrime = true;
    for (int i=2;i<=n-1;i++){
        if(n%i==0){
            isPrime = false;
            break;
        }
    }
    return isPrime;
}
public static boolean isprime (int n){
    if (n == 2){
        return true;
    }
    boolean isprime=true;
    for (int i=2;i<=Math.sqrt(n);i++){
        if (n%i==0){
            return false;
        }
    }
    return true;
}
public static void primesinrange(int n){
    for (int i=2;i<=n;i++){
        if (isPrime(i)){
            System.out.println(i+" ");
        }
    }
    System.out.println();
}
public static void bintodec(int n){
    int mynum=n;
    int pow = 0;
    int dec =0;
   while (n>0){
    int lastdigit=n%10;
    dec = dec + (lastdigit * (int)Math.pow(2,pow));
 pow++;
 n = n/10;
   } 
   System.out.println("decimal of"+ mynum +"="+dec);
}
public static void dectobin(int n){
   int mynum = n;
int pow=0;
int binnum=0;
while (n>0){
    int rem =n %2;
    binnum=binnum+(rem*(int)Math.pow(10,pow));
    pow++;
    n =n/2;
}
System.out.println("binary  of"+ mynum +"="+binnum);
}
public static void main(String arrgs[]){
    //System.out.println(sum(3,5));
   // System.out.println(sum(3.5f,5.9f));
  // System.out.println(isprime(5));
   //primesinrange(16);
  // bintodec(101);
   dectobin(7);
}

}