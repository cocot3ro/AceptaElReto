import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numMediciones;
        int tolerancia;
        int[] mediciones;

        while (true) {

            numMediciones = sc.nextInt();
            tolerancia = sc.nextInt();

            mediciones = new int[numMediciones];

            if (numMediciones == 0 && tolerancia == 0) {
                System.exit(0);
            }

            for (int i = 0; i < numMediciones; i++) {
                mediciones[i] = sc.nextInt();
            }

            int maximo = getMax(mediciones, tolerancia);

            System.out.println(maximo);

        }

    }

    private static int getMax(int[] mediciones, int tolerancia) {
        int sum = 0, aux = 0, exit = 0, max = 0;
        for (int i = 0; i < mediciones.length; i++) {
            if (mediciones[i] == 1) {
                for (int j = i; j < mediciones.length; j++) {
                    sum++;
                    exit = j;

                    if (mediciones[j] == 1) {
                        aux = 0;
                        max = Math.max(max, sum);
                    } else {
                        aux++;
                    }

                    if (aux > tolerancia) {
                        break;
                    }

                }

                i = exit;
                sum = 0;
                aux = 0;
            }
        }
        return max;
    }
}
