import java.util.Scanner;

public class Year
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        System.out.println("Enter the year : "+n);

        if(n%4==0)
        {
            System.out.println(" Leap Year");
            if(n%4!=0)
            {
                System.out.println(" Not a Leap Year");
            }
        }
    }
}