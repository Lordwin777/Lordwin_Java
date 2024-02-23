/*WAP in java to print a fibonacci series with function */
public class Fibonacci_Series 
{

    public static void main(String[] args) 
    {
        int length = 10; // specify the length of the Fibonacci series here
        Fibo_Series(length);
    }

    
    public static void Fibo_Series(int length) 
    {
        if (length < 1) 
        {
            System.out.println("Invalid length. Please specify a positive integer.");
            return;
        }

        int num1 = 0;
        int num2 = 1;

        System.out.print("Fibonacci series of length " + length + ": ");
        for (int i = 0; i < length; i++) 
        {
            System.out.print(num1 + " ");
            int num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
        }
        System.out.println();
    }
}
