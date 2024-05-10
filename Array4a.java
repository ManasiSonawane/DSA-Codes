import java.util.*;
//Pairs in an array
public class Array4a {
   /* public static void printPairs(int numbers[]) {
        for (int i=0;i<numbers.length;i++){
            int curr = numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println();
        }
    }*/
    /*public static void printSubarrays(int numbers[]){
       int ts=0;
        for (int i=0;i<numbers.length;i++){
            int start =i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                for (int k=start ;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                ts ++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarrays="+ts);
    }*/
    public static void subarray1(int numbers[]){
        int currSum =0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[]=new int [numbers.length];
        prefix[0]=numbers[0];

        //cal prefix array
        for (int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1]+ numbers[i];
        }
        for (int i =0; i<numbers.length;i++){
            int start = i ;
            for (int j=i; j<numbers.length; j++){
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
             if (maxSum<currSum){
                maxSum = currSum;
             }

            }
        }

    }
    public static void kadanes(int numbers[]){
      int ms =Integer.MIN_VALUE;
      int cs =0;
      for (int i=0;i<numbers.length;i++){
        cs =cs+ numbers[i];
        if (cs<0){
            cs=0;

        }
        ms = Math.max(cs,ms);
      }
        System.out.println("our max subarray sum is"+ ms);
    }

    public static void main(String args[]){
        int numbers[]={-2,-3,4,-1,-2,1,5,-3};
        // printPairs(numbers);
         //printSubarrays( numbers);
        // subarray1(numbers);
        kadanes( numbers);

    }
}