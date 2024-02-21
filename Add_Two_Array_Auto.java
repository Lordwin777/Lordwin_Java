public class Add_Two_Array_Auto 
{
    public static void main(String[] args) 
    {
        
        int[][] array1 = 
        {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] array2 = 
        {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        
        int[][] sum_Array = new int[3][3];

        
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                sum_Array[i][j] = array1[i][j] + array2[i][j];
            }
        }

        
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++) 
            {
                System.out.print(sum_Array[i][j] + " ");
            }
            System.out.println();
        }
    }
}