import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int e = sc.nextInt(), vMax = sc.nextInt(), t = sc.nextInt(); !(e == 0 && vMax == 0 && t == 0) ; e = sc.nextInt(), vMax = sc.nextInt(), t = sc.nextInt()) {
            if (e < 1 || vMax < 1 || t < 1) {
                System.out.println("ERROR");
                continue;
            }

            double v = ((double) e / t) * 18 / 5;
            if (v > vMax) {
                if (v > (1.2 * vMax)) {
                    System.out.println("PUNTOS");
                } else {
                    System.out.println("MULTA");
                }
            } else {
                System.out.println("OK");
            }
        }
    }
}
