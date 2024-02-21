import java.util.Scanner;
public class Self_Array
{
    public static void main(String[] args) 
    {
         int [][] matrix = new int [3][3];
         int x=0;
         for (int Q=0; Q<matrix.length; Q++)
         {
            for (int r=0; r< matrix[Q].length; r++)
            {
               matrix[Q][r]=x;
               System.out.print( x +" ");
               x=x+1;
            }
            System.out.println();
         }
    }
}