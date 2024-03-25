import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int replicantesAnalizados = sc.nextInt();
            int replicantesIncorrectos = sc.nextInt();
            int humanosAnalizados = sc.nextInt();
            int humanosIncorrectos = sc.nextInt();
            int humanosEstimados = sc.nextInt();
            int replicantesEstimados = sc.nextInt();

            double probHumano = (double) humanosIncorrectos / humanosAnalizados;
            double probReplicante = (double) replicantesIncorrectos / replicantesAnalizados;

            double A = replicantesEstimados - (replicantesEstimados * probReplicante);
            double H = humanosEstimados * probHumano;

            double res = A / (A + H);

            if (res >= 0.9) {
                System.out.println("APRUEBA");
            } else {
                System.out.println("SUSPENDE");
            }
        }

        sc.close();
    }
}
