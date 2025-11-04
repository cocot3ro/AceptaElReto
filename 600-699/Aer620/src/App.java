import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int capacidadCara = sc.nextInt();

            int sum = 0;
            int[] juegos = new int[sc.nextInt()];
            for (int i = 0; i < juegos.length; i++) {
                juegos[i] = sc.nextInt();
                sum += juegos[i];
            }

            if (sum > capacidadCara * 2) {
                System.out.println("NO");
                continue;
            }

        }
    }
}
