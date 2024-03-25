import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        testcase:
        for (int n = sc.nextInt(), queens = sc.nextInt(); n != 0 || queens != 0; n = sc.nextInt(), queens = sc.nextInt()) {
            boolean[] filas = new boolean[n];
            boolean[] columnas = new boolean[n];
            boolean[][] diagonales = new boolean[2][n * 2 - 1];

            for (int i = 0; i < queens; i++) {
                int fila = sc.nextInt() - 1;
                int columna = sc.nextInt() - 1;

                if (filas[fila] || columnas[columna] || diagonales[0][fila + columna] || diagonales[1][fila - columna + n - 1]) {
                    System.out.println("SI");
                    for (int j = i + 1; j < queens; j++) {
                        sc.nextInt();
                        sc.nextInt();
                    }
                    continue testcase;
                }

                filas[fila] = true;
                columnas[columna] = true;
                diagonales[0][fila + columna] = true;
                diagonales[1][fila - columna + n - 1] = true;
            }
            System.out.println("NO");
        }
    }
}
