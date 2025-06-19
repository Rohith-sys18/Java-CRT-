import java.util.Scanner;

public class NthPrime {

    // Function to check if a number is prime
    public static boolean isPrime(int n1) {
        if (n1 < 2) return false;
        for (int i = 2; i <= Math.sqrt(n1); i++) {
            if (n1 % i == 0) return false;
        }
        return true;
    }

    // Function to find the nth prime number
    public static int nthPrime(int n) {
        int count = 0;
        int num = 1;

        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num;
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int nthPrimeNumber = nthPrime(n);
        System.out.println(n + "th Prime Number is: " + nthPrimeNumber);
    }
}
