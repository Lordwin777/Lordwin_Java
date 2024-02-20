import java.util.Scanner;
public class triangle_checker
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 value of the triangle : ");
        int a,b,c,d;
        a = sc.nextInt();
        System.out.println("A value: "+a);

        b = sc.nextInt();
        System.out.println("B value : "+b);

        c= sc.nextInt();
        System.out.println("C value : "+c);

        d= a+b+c;

        if(d==180)
        {
            System.out.println(" It is a trinagle"+d);
        }
            else
            {
                System.out.println("Not a triangle"+d);
            }

	}
}