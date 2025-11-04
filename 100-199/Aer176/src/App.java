import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int columnas =  sc.nextInt();
        int filas = sc.nextInt();

        while (filas != 0 && columnas != 0) {

            char[][] tablero = new char[filas][columnas];
            
            for (int i = 0; i < tablero.length; i++) {
                String linea = sc.next();
                for (int j = 0; j < tablero[i].length; j++) {
                    tablero[i][j] = linea.charAt(j);
                }
            }

            int celdas6Bombas = 0;

            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero[i].length; j++) {
                    int numBombas = 0;
                    if (tablero[i][j] == '-') {
                        for (int f = Math.max(0, i - 1); f < Math.min(tablero.length, i + 2); f++) {
                            for (int c = Math.max(0, j - 1); c < Math.min(tablero[f].length, j + 2); c++) {
                                if (tablero[f][c] == '*') {
                                    numBombas++;
                                }
                            }
                        }
                    }
                    if (numBombas >= 6) {
                        celdas6Bombas++;
                    }
                }
            }

            System.out.println(celdas6Bombas);
            
            columnas =  sc.nextInt();
            filas = sc.nextInt();
        }

        sc.close();
    }
}
