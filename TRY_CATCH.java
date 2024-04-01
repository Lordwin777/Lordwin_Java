public class TRY_CATCH
{
    public static void main(String[] args) 
    {
        
        try
        {
            int a = 10 , b = 0 , c ;
            c =a/b;
            System.out.println(c);
        }

            catch (ArithmeticException e)
            {
                System.out.println("Ultimate Error : Zero");
            }

    }
