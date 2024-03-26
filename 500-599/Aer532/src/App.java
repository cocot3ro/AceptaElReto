import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int casos = sc.nextInt(); casos > 0; casos--) {
            System.out.println(-(sc.nextInt() - sc.nextInt()));
        }

        sc.close();
    }
}
