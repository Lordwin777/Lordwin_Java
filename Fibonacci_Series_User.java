import java.util.Scanner;

public class Fibonacci_Series_User
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the Fibonacci series: ");
        int length = sc.nextInt();
        Fibo_Series(length);
    }

    
    public static void Fibo_Series(int length) 
    {
        if (length < 1) 
        {
            System.out.println("Invalid length");
            return;
        }

        int num1 = 0;
        int num2 = 1;

        System.out.print("Fibonacci series of length = " + length + " : ");
        for (int i = 0; i < length; i++) 
        {
            System.out.print(num1 + "\n");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }
}