import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int numLosas = sc.nextInt() * sc.nextInt();
            System.out.println((int) Math.ceil(numLosas / 2d) + " " + numLosas / 2);
        }
    }
}
