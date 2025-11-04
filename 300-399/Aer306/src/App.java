import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i != 0; i = sc.nextInt()) {
            System.out.println((int) (fib(i) % 46337));
        }
    }

    private static long fib(int n) {
        if (n < 2) {
            return 1;
        }

        long[] fib = new long[n + 1];

        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
}
