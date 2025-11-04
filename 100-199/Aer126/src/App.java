import java.math.BigInteger;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p = sc.nextInt();
        BigInteger n = new BigInteger((sc.next()));
        for (; !(p < 0 && (Integer.parseInt(n.toString())) < 0); p = sc.nextInt(), n = new BigInteger(String.valueOf(sc.next()))) {
            System.out.println(factorial(n).remainder(new BigInteger(String.valueOf(p))).equals(BigInteger.ZERO) ? "YES" : "NO");
        }

        sc.close();
    }

    static BigInteger factorial(BigInteger n) {
        BigInteger factorial = new BigInteger("1");

        for (int i = Integer.parseInt(n.toString()); i > 0; i--) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }

        return factorial;
    }
}
