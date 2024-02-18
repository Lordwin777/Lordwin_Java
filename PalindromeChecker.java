public class PalindromeChecker 
{
    public static void main(String[] args) 
    {
        long num = 12321;
        if (Palindrome(num)) 
        {
            System.out.println(num + " is a palindrome number.");
        } else 
        {
            System.out.println(num + " is not a palindrome number.");
        }
    }

    public static boolean Palindrome(long num) 
    {
        long reversedNum = 0, remainder, originalNum = num;

        while (num != 0) 
        {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        return originalNum == reversedNum;
    }
}