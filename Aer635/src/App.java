import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int entrada = sc.nextInt();
            System.out.println(entrada / 100 + (entrada % 100 == 0 ? 0 : 1));
        }
    }
}
