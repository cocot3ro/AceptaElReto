import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int base = sc.nextInt();
            int exponente = sc.nextInt();
            int a = 1;
            int res = 1;

            for (int i = 0; i < exponente; i++) {
                a = (a * base) % 1_000_007;
                res = (res + a) % 1_000_007;
            }
            System.out.println(res);
        }
    }
}
