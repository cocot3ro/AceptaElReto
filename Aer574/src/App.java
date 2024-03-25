import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            long n = sc.nextLong();
            long k = sc.nextLong() - 1;

            System.out.println(recursive(n, k));
        }
    }

    private static char recursive(long n, long k) {
        if (n == 1) {
            if (k == 0L) {
                return 'B';
            } else if (k == 1L) {
                return 'U';
            } else {
                return 'H';
            }
        }

        long length = 3;
        long prevLevelSize = 3;
        for (long j = 0; j < n - 1; j++) {
            length = length * 2 + j + 4;
            if (j == n - 3) {
                prevLevelSize = length;
            }
        }

        if (prevLevelSize <= k && k < prevLevelSize + 2 + n) {
            if (k == prevLevelSize) {
                return 'B';
            } else if (k == prevLevelSize + 1 + n) {
                return 'H';
            } else {
                return 'U';
            }
        } else {
            if (k > prevLevelSize) {
                k = k - prevLevelSize - 2 - n;
            }
            return recursive(n - 1, k);
        }
    }
}
