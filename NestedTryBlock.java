public class NestedTryBlock
{
    public static void main(String[] args) 
    {
        try
        {
             System.out.println("going to divide it by 0");

             int b = 35/0;
        }

        catch(ArithmeticException e)
        {
             System.out.println(e);
        }
		
        catch(Exception e)
        {
             System.out.println("Handled the exception (outer catch)");
        }

        System.out.println("normal Flow....");
	}
}