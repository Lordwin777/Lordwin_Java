import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a;
        a = sc.nextInt();
        System.out.println("Enter the value : "+a);

        int b;
        b = sc.nextInt();
        System.out.println("Enter the value : "+b);

        int c;

         System.out.println("ADDITION 1 : ");
         System.out.println("SUBTRACT 2 : ");
         System.out.println("MULTIPLY 3 : ");
         System.out.println("DIVIDE   4 : ");

        int i;
        i = sc.nextInt();
        System.out.println("YOUR CHOICE : "+i);


         switch(i)
         {
             case 1:
            c = a+b;
            System.out.println("ADDITION : "+c);
            break;

             case 2:
            c = a-b;
            System.out.println("SUBTRACT : "+c);
            break;

             case 3:
            c = a*b;
            System.out.println("MULTIPLY : "+c);
            break;

             case 4:
            c = a/b;
            System.out.println("DIVIDE : "+c);
            break;

             default:
            System.out.println("INCORRECT OPERATION : ");
            break;
         }	
	}
}