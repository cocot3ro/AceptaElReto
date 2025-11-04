import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = sc.nextInt(); i > 0; i--) {
            int patos = sc.nextInt();
            System.out.println(patos + " " + patos * 2);
        }
        sc.close();
    }
}
