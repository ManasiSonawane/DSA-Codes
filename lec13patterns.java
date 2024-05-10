public class lec13patterns{
    public static void hollow_rect(int totrows,int totcols){
for (int i=1;i<=totrows;i++){
    //inner loop
   for (int j=1;j<=totcols;j++){
    if(i == 1|| i== totrows ||j == 1 || j == totcols){
        System.out.print("*");
    }else{
        System.out.print(" ");
    }
    
   } 
   System.out.println();
  }
    }
    public static void inverted_rotated_half_pyramid(int n){
       //outer loop
        for (int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            //stars
        for (int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
        }
    }
    public static void inverted_half_pyramid1to5(int n){
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void floyds_triangle(int n){
        for (int i=1;i<=n;i++){
            int counter=1;
            for (int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void zeroonetriangle(int n) {
        for (int i=1;i<=n;i++){
            for(int j=1;j<=i ;j++){
                if((i+j)%2 ==0){
                    System.out.print("1");
                
                }
                else{
                    System.out.print("0");

                }
            }
            System.out.println();
        }
    }
    public static void butterflypattern(int n){
        for (int i=1;i<=n;i++){
            //stars=1
             for(int j=1;j<=i; j++){
                System.out.print("*");
             }

            //spaces=2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }


            //stars=i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
//2 nd half
for (int i=n;i>=1;i--){
    for(int j=1;j<=i;j++){
        System.out.print("*");
     }

    //spaces=2*(n-i)
    for(int j=1;j<=2*(n-i);j++){
        System.out.print(" ");
    }


    //stars=i
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }System.out.println();
}
    }
   public static void solidrhombus (int n){
    for (int i=1;i<=n;i++){
        for (int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=n;j++){
            System.out.print("*");
    }
    
    System.out.println();
    }
   }
   public static void hollowrhombus (int n){
    for (int i=1;i<=n;i++){
        for(int j=1;j<=n-i ;j++){
            System.out.print(" ");
        }
        //hollow rect
        for(int j=1;j<=n;j++){
           if ( i ==1 || i==n ||j==1 || j== n) {
            System.out.print("*");
        
           }else{
            System.out.print(" ");
           }
        }
        System.out.println();

    }
}
public static void diamond(int n){
    for(int i=1;i<=n; i++){
        for (int j=1; j<=(n-i); j++){
            System.out.print(" ");
        }
        for (int j=1; j<=(2*i)-1; j++){
            System.out.print("*");
        }System.out.println();

    }
    for(int i=n;i>=1;i--){
        for (int j=1;j<=(n-i); j++){
            System.out.print(" ");
        }
        for (int j=1;j<=(2*i)-1;j++){
            System.out.print("*");
        }System.out.println();

    }

}
    public static void main(String args[]){
        //hollow_rect(4,5);
        //inverted_rotated_half_pyramid(7);
        //inverted_half_pyramid1to5(5);
        //floyds_triangle(5);
        //zeroonetriangle(5);
        //butterflypattern(4);
        //solidrhombus (5);
        //hollowrhombus (5);
        diamond(5);
    }
}