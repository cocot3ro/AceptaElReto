import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Coste {
    int cteCompe;
    int cteTencia;

    public Coste(int cteCompe, int cteTencia) {
        this.cteCompe = cteCompe;
        this.cteTencia = cteTencia;
    }
}

public class Aer524 {

    static Scanner in;

    public static boolean casoDePrueba() {
        int numeroCompras = in.nextInt();

        if (numeroCompras == 0)
            return false;
        else {
            int minimoComprasCompe = in.nextInt();
            int minimoComprasTencia = in.nextInt();

            int[] cestaCompe = new int[numeroCompras];
            int[] cestaTencia = new int[numeroCompras];

            for (int i = 0; i < numeroCompras; i++) {
                cestaCompe[i] = in.nextInt();
            }

            for (int i = 0; i < numeroCompras; i++) {
                cestaTencia[i] = in.nextInt();
            }

            System.out.println(calcularGastoMinimo(numeroCompras, minimoComprasCompe, minimoComprasTencia, cestaCompe, cestaTencia));

            return true;
        }

    }

    public static int calcularGastoMinimo(int numeroCompras, int minimoComprasCompe, int minimoComprasTencia, int[] cestaCompe, int[] cestaTencia) {
        Coste[] costes = new Coste[numeroCompras];

        for (int i = 0; i < numeroCompras; i++) {
            costes[i] = new Coste(
                    cestaCompe[i],
                    cestaTencia[i]
            );
        }

        Arrays.sort(costes, new Comparator<Coste>() {
            @Override
            public int compare(Coste c1, Coste c2) {
                return Integer.compare((c1.cteCompe - c1.cteTencia), (c2.cteCompe - c2.cteTencia));
            }
        });

        int gastoMinimo = 0;

        for (int i = 0; i < minimoComprasCompe; ++i)
            gastoMinimo += costes[i].cteCompe;
        for (int j = numeroCompras - 1; j >= numeroCompras - minimoComprasTencia; --j)
            gastoMinimo += costes[j].cteTencia;
        for (int i = minimoComprasCompe; i < numeroCompras - minimoComprasTencia; ++i)
            gastoMinimo += Math.min(costes[i].cteCompe, costes[i].cteTencia);

        return gastoMinimo;
    }

    public static void main(String[] args) {

        in = new Scanner(System.in);

        while (casoDePrueba()) ;

    }

}
