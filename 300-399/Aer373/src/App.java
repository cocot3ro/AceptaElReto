import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int length = sc.nextInt();

            long top = (long)Math.pow(length, 2);
            long side = length * (length - 2L);
            long front = (long)Math.pow((length - 2), 2);

            System.out.println(top * 2 + side * 2 + front * 2);
        }
    }
}
