import java.util.Scanner;

public class Salary
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int basic_Salary, hra, da, gross_Salary;
        basic_Salary = sc.nextInt();
        System.out.println(" Enter the base salary : "+basic_Salary);


        if(basic_Salary <1500)
        {
            hra= basic_Salary/10;
            System.out.println("hra =  "+hra);

            da = (9*basic_Salary/10);
            System.out.println(" da = "+da);

            gross_Salary = basic_Salary + hra + da;
            System.out.println("The gross salary=  "+gross_Salary);
        }
        else
        {
            hra = 500;
            System.out.println("hra = "+hra);

            da = 98*basic_Salary/100;
            System.out.println(" da = "+da);

            gross_Salary = basic_Salary + hra + da;
            System.out.println(" gross  salary "+gross_Salary);
        }
        
    }
}