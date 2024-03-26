import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = sc.nextInt(); i > 0; i--) {
            int segundos = sc.nextInt();
            int horas, minutos;
            horas = segundos / 3600;
            segundos %= 3600;
            minutos = segundos / 60;
            segundos %= 60;
            System.out.printf("%02d:%02d:%02d%n", horas, minutos, segundos);
        }
    }
}
