import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = sc.nextInt(); i > 0; i--) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int cerillas = (n + 1) * m + (m + 1) * n;
            System.out.println(cerillas);
        }
    }
}