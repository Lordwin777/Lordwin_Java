import java.util.Scanner;

public class PowerMathDemo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		int num, pow, Result;
        num = sc.nextInt();
        System.out.println("Enter the num : "+num);
        pow = sc.nextInt();
        System.out.println("Enter the pow :" +pow);
        PowerMathDemo pmd = new PowerMathDemo();
        Result = pmd.power(num,pow);
        System.out.println("Answer :"+Result);
	}

    int power(int a ,int b)
    {
        int i;
        int r=1;
        for(i=1 ; i<=b; i++)
        {
            r = r*a;
        }
        return r;
    }
}