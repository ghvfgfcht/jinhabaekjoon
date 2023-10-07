import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            long result = findSmallestPrime(n);
            System.out.println(result);
        }
    }

    public static long findSmallestPrime(long n) {
        if (n <= 1) {
            return 2;
        }
        if (n == 2) {
            return 2;
        }
        if (n % 2 == 0) {
            n++;
        }
        while (!isPrime(n)) {
            n += 2;
        }
        return n;
    }

    public static boolean isPrime(long x) {
        if (x <= 1) {
            return false;
        }
        if (x <= 3) {
            return true;
        }
        if (x % 2 == 0 || x % 3 == 0) {
            return false;
        }
        for (long i = 5; i * i <= x; i += 6) {
            if (x % i == 0 || x % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}