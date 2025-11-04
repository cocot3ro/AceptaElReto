import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i = sc.nextInt();
        while (!(n == 0 && i == 0)) {

            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            while (!(c1 == 0 && c2 == 0)) {

                if (c1 == i) {
                    i = c2;
                } else if (c2 == i) {
                    i = c1;
                }

                c1 = sc.nextInt();
                c2 = sc.nextInt();
            }

            System.out.println(i);

            n = sc.nextInt();
            i = sc.nextInt();
        }
    }
}
