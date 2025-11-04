import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int entrada = sc.nextInt();
        while (entrada != 0) {
            int contador = 0;
            for (int i = 1; i <= Math.sqrt(entrada); i++) {
                if (entrada % i == 0) {
                    if(entrada/i==i) contador++;
                    else contador+=2;
                }
            }
            System.out.println(contador);
            entrada = sc.nextInt();
        }

        sc.close();
    }
}
