import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int tamaño;

        while ((tamaño = sc.nextInt()) != 0) {

            String resultado = "SI";

            int[][] matriz = new int[tamaño][tamaño];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }

            comprobacion:
            for (int i = 1; i < matriz.length; i++) {
                for (int j = 0; j < i; j++) {
                    if (matriz[i][j] != 0) {
                        resultado = "NO";
                        break comprobacion;
                    }
                }
            }

            if (resultado.equals("SI")) {
                System.out.println(resultado);
                continue;
            }

            comprobacion:
            for (int i = 0; i < matriz.length - 1; i++) {
                for (int j = i + 1; j < matriz[i].length; j++) {
                    if (matriz[i][j] != 0) {
                        resultado = "NO";
                        break comprobacion;
                    } else if (matriz[i][j] == 0) {
                        resultado = "SI";
                    }
                }
            }
            System.out.println(resultado);
        }
        sc.close();
    }
}
