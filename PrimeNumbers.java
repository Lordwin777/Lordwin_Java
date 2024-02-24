public class PrimeNumbers {
  public static void main(String[] args) {
    int limit = 100; // Change this value to print prime numbers up to a different limit

    System.out.println("Prime numbers up to " + limit + ":");
    for (int i = 2; i <= limit; i++) {
      if (isPrime(i)) {
        System.out.print(i + " ");
      }
    }
  }

  private static boolean isPrime(int num) {
    if (num < 2) {
      return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        return false;
      }
    }
    return true;
  }
}