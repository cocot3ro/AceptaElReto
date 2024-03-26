import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int arriba = 0;
            int abajo = 0;
            int muros = sc.nextInt();
            int first = sc.nextInt();
            for (int j = muros - 1; j > 0; j--) {
                int next = sc.nextInt();
                if (first < next) {
                    arriba++;
                } else if (first > next) {
                    abajo++;
                }
                first = next;
            }

            System.out.println(arriba + " " + abajo);
        }
    }
}
