import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        while (true) {
            
            int integrantes = sc.nextInt();
            int pesoMax = sc.nextInt();

            if (integrantes == 0 && pesoMax == 0) break;

            int[] personas = new int[integrantes];

            int numPersonas = 0;
            for (int i = 0; i < integrantes; i++) {
                int peso = sc.nextInt();
                if (peso <= pesoMax) {
                    personas[numPersonas] = peso;
                    numPersonas++;
                }
            }

            Arrays.sort(personas, 0, numPersonas);

            long parejas = 0;
            int ini = 0;
            int fin = numPersonas - 1;

            while (ini < fin) {
                long pesoTandem = personas[ini] + personas[fin];
                if (pesoTandem > pesoMax) {
                    fin--;
                }
                else {
                    parejas += fin - ini;
                    ini++;
                }
            }

            System.out.println(parejas);
        }

        sc.close();
    }
}
