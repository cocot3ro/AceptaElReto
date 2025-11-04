import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int casos = sc.nextInt(); casos > 0; casos--) {
            int ans = 0;

            int compartimentos = sc.nextInt();
            int capacidadMax = sc.nextInt();
            int diferencia = sc.nextInt();

            for (int i = 0; i < compartimentos; i++) {
                ans += capacidadMax - i * diferencia;
            }

            System.out.println(ans);
        }
    }
}
