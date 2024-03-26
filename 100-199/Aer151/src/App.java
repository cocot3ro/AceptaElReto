import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int tamaño;
        String resultado = "";
        
        while((tamaño = sc.nextInt()) != 0) {

            int[][] matriz = new int[tamaño][tamaño];

            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    matriz[i][j] = sc.nextInt();
                }
            }

            comprobacion:
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    if (i == j && matriz[i][j] == 1) {
                        resultado = "SI";
                    } else if (i == j && matriz[i][j] == 0) {
                        resultado = "NO";
                        break comprobacion;
                    } else if (matriz[i][j] == 0) {
                        resultado = "SI";
                    } else {
                        resultado = "NO";
                        break comprobacion;
                    }
                }
            }
            System.out.println(resultado);
        }

        sc.close();
    }
}
