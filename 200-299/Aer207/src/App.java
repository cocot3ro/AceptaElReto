import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int filas = sc.nextInt();
        int columnas = sc.nextInt();
        int numArboles = sc.nextInt();

        while (!(filas == 0 && columnas == 0 && numArboles == 0)) {

            int[][] camping = new int[filas][columnas];

            for (int i = 0; i < numArboles; i++) {
                int columna = sc.nextInt() - 1;
                int fila = sc.nextInt() - 1;
                camping[columna][fila] = 1;
            }

            int sombras = 0;

            for (int i = 0; i < camping.length; i++) {
                for (int j = 0; j < camping[i].length; j++) {
                    if (camping[i][j] != 1) {
                        comprobarVecinos:
                        for (int f = Math.max(0, i - 1); f < Math.min(camping.length, i + 2); f++) {
                            for (int c = Math.max(0, j - 1); c < Math.min(camping[f].length, j + 2); c++) {
                                if (camping[f][c] == 1) {
                                    sombras++;
                                    break comprobarVecinos;
                                }
                            }
                        }
                    }
                }
            }

            System.out.println(sombras);

            filas = sc.nextInt();
            columnas = sc.nextInt();
            numArboles = sc.nextInt();
        }

        sc.close();
    }
}
