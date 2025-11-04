import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int escaque;
        while ((escaque = sc.nextInt()) != 0) {
            char c = sc.next().charAt(0);
            System.out.print("|");
            for (int i = 0; i < escaque * 8; i++) {
                System.out.print("-");
            }
            System.out.println("|");
            for (int i = 0; i < 8; i++) {
                boolean b = i % 2 == 0;
                for (int j = 0; j < escaque; j++) {
                    System.out.print("|");
                    for (int k = 0; k < 8; k++) {
                        for (int l = 0; l < escaque; l++) {
                            System.out.print(b ? " " : c);
                        }
                        b = !b;
                    }
                    System.out.println("|");
                }
            }System.out.print("|");
            for (int i = 0; i < escaque * 8; i++) {
                System.out.print("-");
            }
            System.out.println("|");
        }
    }
}
