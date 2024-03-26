import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(), n = sc.nextInt(); !(i == 0 && n == 0); i = sc.nextInt(), n = sc.nextInt()) {
            int[] casos = new int[n];
            for (int j = 0; j < n; j++) {
                casos[j] = sc.nextInt();
            }
            Arrays.sort(casos);
            int suma = 0;
            for (int j = 0; j < i; j++) {
                suma += casos[n - 1 - j];
            }

            System.out.println(suma);
        }
    }
}
