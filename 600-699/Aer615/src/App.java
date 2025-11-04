import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0 ; i--) {
            int n = sc.nextInt() + 1;
            int f = sc.nextInt();
            int t = sc.nextInt();

            System.out.println(((t % n)) * f);
        }
    }
}
