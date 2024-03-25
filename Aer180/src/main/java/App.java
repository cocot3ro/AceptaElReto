import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        int[] lados = new int[3];
        int aux;

        for (int i = 0; i < casos; i++) {
            lados[0] = sc.nextInt();
            lados[1] = sc.nextInt();
            lados[2] = sc.nextInt();

            for (int j = 0; j < lados.length; j++) {
                for (int k = 0; k < lados.length - 1; k++) {
                    if (lados[k] > lados[k + 1]) {
                        aux = lados[k];
                        lados[k] = lados[k + 1];
                        lados[k + 1] = aux;
                    }
                }
            }

            if (lados[0] + lados[1] > lados[2]) {
                if (lados[0] * lados[0] + lados[1] * lados[1] == lados[2] * lados[2]) {
                    System.out.println("RECTANGULO");
                } else if (lados[0] * lados[0] + lados[1] * lados[1] > lados[2] * lados[2]) {
                    System.out.println("ACUTANGULO");
                } else {
                    System.out.println("OBTUSANGULO");
                }
            } else {
                System.out.println("IMPOSIBLE");
            }
        }

        sc.close();

    }
}
