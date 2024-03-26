import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < n; i++) {
            String horaEspejo = scanner.nextLine();

            String horaReal = obtenerHoraReal(horaEspejo);
            System.out.println(horaReal);
        }

        scanner.close();
    }

    private static String obtenerHoraReal(String horaEspejo) {
        String[] partes = horaEspejo.split(":");
        int horas = Integer.parseInt(partes[0]);
        int minutos = Integer.parseInt(partes[1]);

        int horasReales = 12 - horas;
        int minutosReales = (60 - minutos) % 60;

        if (horasReales == 0) {
            horasReales = 11;
            if (minutosReales == 0) {
                horasReales = 12;
            }
        } else if (horasReales == 12) {
            horasReales = 0;
        } else {
            horasReales--;
        }

        return String.format("%02d:%02d", horasReales, minutosReales);
    }
}
