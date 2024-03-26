import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int num = sc.nextInt();

            System.out.println(num % 3 == 0 || (num + 1) % 3 == 0 ? "SI" : "NO");
        }

        sc.close();
    }
}
