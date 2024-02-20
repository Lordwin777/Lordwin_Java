import java.util.Scanner;
public class Increment_All_Digit
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n, count = 0, inc=1, num;
        n = sc.nextInt();
        System.out.println("Enter the value : "+n);
        num =n;
        while(num>0)
        {
            count = count + 1;
            num = num / 10;

        }
         while(count > 1)
         {
             inc = inc *10;
             inc = inc +1;
             count = count-1;
         }
         n = n + inc;
         System.out.println("Enter the value : "+n);
		
	}
}