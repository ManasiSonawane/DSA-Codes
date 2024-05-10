import java.util.*;
public class spiralmatrix {
public static void printSpiral(int matrix[][]){
    int startrow=0;
    int startcoln=0;
    int endrow=matrix.length-1;
    int endcoln= matrix[0].length-1;

     while (startrow<=endrow && startcoln<=endcoln){
        //top 
        for (int j=startcoln;j<=endrow;j++){
            System.out.print(matrix[startrow][j]+" ");
        }
        //right
        for (int i=startrow+1;i<=endrow;i++){
            System.out.print(matrix[i][endcoln]+" ");
        }
        //bottom
        for (int j=endcoln-1;j<=startcoln;j--){
            if (startrow == endrow){
                break;
            }
            System.out.print(matrix[endrow][j]+" ");
        }
        //left
        for (int i=endrow-1;i<=startrow+1;i--){
            if (startcoln == endcoln){
                break;
            }
            System.out.print(matrix[i][startcoln]+" ");
        }
        startcoln++;
        startrow++;
        endcoln--;
        endrow--;
     }
    }
    public static int diagonalsum(int matrix[][]){
        int sum =0;
        /*for (int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                if (i == j){
                    sum +=matrix [i][j];

                }
                else if(i+j ==matrix.length-1){
                    sum +=matrix [i][j];
                   }
            }
        }*/
        for (int i=0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            if (i !=matrix.length-1-i)
            sum+=matrix[i][matrix.length-i-1];

            

        }
        return sum;
    }
public static boolean stairscasesearch(int matrix[][], int key){
    int row =0,col= matrix[0].length-1;
    while (row<matrix.length && col>=0){
        if (matrix[row][col]== key){
            System.out.println("found key at("+ row +","+col+")");
            return true;
        
        }
        else if (key <matrix[row][col]){
            col--;
        }
        else {
            row++;

        }
    }
    System.out.println("key not found");
    return false;
} 
     public static void main(String args[]){
        int matrix[][]={{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12},
                         {13, 14, 15,16}};
       //  printSpiral(matrix);
        //System.out.println( diagonalsum(matrix));
    int key =14; 
    stairscasesearch(matrix, key);
    
    }
     
     
}
