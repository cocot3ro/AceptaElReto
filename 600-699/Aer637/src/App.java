import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int casos = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < casos; i++) {
            String entrada = sc.nextLine();
            int puntos = 0;
            for (int j = 0; j < entrada.length(); j++) {
                puntos += morse(entrada.charAt(j)) + 3;
            }
            System.out.println(puntos - 3);
        }
    }

    private static int morse(char caracter) {
        return switch (caracter) {
            case 'E' -> 1;
            case ' ' -> -1;
            case 'I', 'T' -> 3;
            case 'A', 'N', 'S' -> 5;
            case 'D', 'H', 'M', 'R', 'U' -> 7;
            case 'B', 'W', 'F', 'G', 'K', 'L', 'V' -> 9;
            case 'C', 'Z', 'X', 'O', 'P' -> 11;
            case 'J', 'Q', 'Y' -> 13;
            case '?' -> 15;
            case '!' -> 19;
            default -> 0;
        };

    }
}
