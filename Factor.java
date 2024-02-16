import java.util.Scanner;
public class Factor
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        System.out.println("Enter the number : "+num);
        System.out.println("Factors of the number are : ");
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
            {
                System.out.println(" "+i);

            }
        }
		
	}
}