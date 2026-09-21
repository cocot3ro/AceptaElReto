import java.util.Scanner;

public class Aer335 {

    static Scanner in;

    public static void casoDePrueba() {
        int altura = in.nextInt();

        long canicas = 0;
        for (int i = 1; i <= altura; i++) {
            canicas += (i * (i + 1L)) / 2;
        }

        System.out.println(canicas);
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

    }

}
