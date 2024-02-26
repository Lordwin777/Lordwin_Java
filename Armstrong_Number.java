import java.util.Scanner;

public class Armstrong_Number 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int numDigits = getNumberOfDigits(number);
        int sumOfPowers = calculateSumOfPowers(number, numDigits);
        if (isArmstrongNumber(number, sumOfPowers)) 
        {
            System.out.println(number + " is an Armstrong number.");
        } else 
        {
            System.out.println(number + " is not an Armstrong number.");
        }
    }

    private static int getNumberOfDigits(int number) 
    {
        int numDigits = 0;
        while (number != 0) {
            number /= 10;
            numDigits++;
        }
        return numDigits;
    }

    private static int calculateSumOfPowers(int number, int numDigits) {
        int sumOfPowers = 0;
        while (number != 0) {
            int digit = number % 10;
            sumOfPowers += Math.pow(digit, numDigits);
            number /= 10;
        }
        return sumOfPowers;
    }

    private static boolean isArmstrongNumber(int number, int sumOfPowers) {
        return number == sumOfPowers;
    }
}