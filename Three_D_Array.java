import java.util.Scanner;

public class Three_D_Array 
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    int[][] array = new int[3][3];

    System.out.println("Enter the elements of the 3 by 3 array:");
    System.out.println("\n");
    for (int i = 0; i < 3; i++) 
    {
      for (int j = 0; j < 3; j++) 
      {
        array[i][j] = scanner.nextInt();
      }
    }

    System.out.println("The 3 by 3 array is:");
    System.out.println("\n");
    for (int i = 0; i < 3; i++) 
    {
      for (int j = 0; j < 3; j++) 
      {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}