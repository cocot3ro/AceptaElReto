import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s;
        while (!(s  = sc.nextLine()).startsWith(".")) {
            int prendasVerano = 0;
            int prendasInvierno = 0;
            for (char c : s.substring(0, s.length() - 2).toCharArray()) {
                switch (c) {
                    case 'V':
                        prendasVerano++;
                        break;
                    case 'I':
                        prendasInvierno++;
                        break;
                    case 'A':
                        prendasVerano++;
                        prendasInvierno++;
                        break;
                }
            }

            if (prendasVerano > prendasInvierno) {
                System.out.println("VERANO");
            } else if (prendasInvierno > prendasVerano) {
                System.out.println("INVIERNO");
            } else {
                System.out.println("EMPATE");
            }
        }
    }
}