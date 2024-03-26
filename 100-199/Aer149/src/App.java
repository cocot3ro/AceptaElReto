import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int toros = sc.nextInt();

            int v = -1;

            for (int i = 0; i < toros; i++) {
                v = Math.max(v, sc.nextInt());
            }

            System.out.println(v);
        }
    }
}
