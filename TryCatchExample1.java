public class TryCatchExample1
{
    public static void main(String[] args) 
    {
		
        int i = 50;
        int j = 0; 
        int data;

        try
        {
            data = 1/j;
        }

        catch(Exception e)
        {
            System.out.println(i/(j+2));
        }
	}
}