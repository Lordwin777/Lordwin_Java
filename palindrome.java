public class palindrome 
{
    public static void main(String[] args) 
    {
        String str = "racecar";
        boolean isPalindrome = checkPanlindome(str);
        System.out.println("Is \"" + str + "\" a palindrome? " + isPalindrome);
    }

    public static boolean checkPanlindome(String str) 
    {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) 
        {
            if (str.charAt(left) != str.charAt(right)) 
            {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}