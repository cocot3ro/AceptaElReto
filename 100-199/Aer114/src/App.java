import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println(1);
            } else if (n < 3 || n == 4) {
                System.out.println(n);
            } else if (n == 3) {
                System.out.println(6);
            } else {
                System.out.println(0);
            }
        }
    }
}
