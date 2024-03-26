import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            System.out.println(recursive(sc.nextInt()));
        }
    }

    private static int recursive(int l) {
        return (l == 1 ? 4 : l * 4 + recursive(l / 2) * 4);
    }
}