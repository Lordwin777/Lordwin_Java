import java.util.Scanner;
public class Positive_Negative
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number  : ");
        n = sc.nextInt();
        System.out.println("Your number is    : "+n);
        
        if(n>=0)
        {
        System.out.println("The number is Positive : "+n);
        }
        else
        {
            System.out.println("The number is Negative : "+n);
        }
		
	}
}