import java.util.Scanner;
public class EvenOdd
{
    public static void main (String[]  args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.println("Enter the value : "+num);

        if(num%2==0)
        {
            System.out.println("Even = "+num);
        }
        else
        {
            System.out.println("Odd = "+num );
        }
    }
}