import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numCasos = scanner.nextInt();

        for (int i = 0; i < numCasos; i++) {
            int dividendo = scanner.nextInt();
            int divisor = scanner.nextInt();

            if (divisor == 0) {
                System.out.println("DIV0");
            } else {
                int cociente = dividendo / divisor;
                int resto = dividendo % divisor;

                if (resto < 0) {
                    resto += Math.abs(divisor);
                    cociente = (dividendo - resto) / divisor;
                }

                System.out.println(cociente + " " + resto);
            }
        }

        scanner.close();
    }
}
