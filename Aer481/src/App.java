import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(), j = sc.nextInt(); !(i == 0 && j == 0); i = sc.nextInt(), j = sc.nextInt()) {
            System.out.println((char) ((8 - i) + 'a') + "" + j);
        }
    }
}
