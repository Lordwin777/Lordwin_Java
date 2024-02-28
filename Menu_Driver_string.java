import java.util.Scanner;
public class Menu_Driver_string
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to My Program");
        
        System.out.println("Press 1 -> Concat");
        System.out.println("Press 2 -> Connect");
        System.out.println("Press 3 -> Control_Boolen");
        System.out.println("Press 4 -> Trim");
        System.out.println("Press 5 -> SubString");
        System.out.println("Press 6 -> Upper Case");
        System.out.println("Press 7 -> Lower Case");
        System.out.println("Enter your Choice : ");
        int i;
        i = sc.nextInt();
        System.out.println("Your Choice : "+i);

        switch(i)
        {
            case 1:
        String str1 = "Gate";
        String str2 = "Way";
        String str3 = str1.concat(str2);
        System.out.println(" "+str3);
        break;

            case 2:
        String str8 = "Compu";
        String str4 = "ter";
        System.out.println(" "+str8+str4);
        break;

            case 3:
        String str = "COMPUTER";
        System.out.println(str.startsWith("COM"));
        System.out.println(str.endsWith("TER"));
        break;

            case 4:
        String str5 = " COMPUTER Sc";
        System.out.println(str5);
        System.out.println(str5.trim());
        break;

            case 5:
        String s6 = "Supreme Overlord";
		System.out.println("Orginal string :"+s6);
        System.out.println("Substring starting from index : "+s6.substring(4));
        System.out.println("Substring starting from index : "+s6.substring(0,4));
        break;

             case 6:
        String str9 = "doctor";
        System.out.println(str9.toUpperCase());
        break;

            case 7:
        String str10 = "MY_DOCUMENTS";
        System.out.println(str10.toLowerCase());
        break;


        default:
        System.out.println("INVALID CHOICE, You Have Entered The Wrong Choice!!!");
        break;

        }
        
		
	}
}