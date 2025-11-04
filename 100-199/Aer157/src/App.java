import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int[] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int casos = sc.nextInt();

        for (int i = 0; i < casos; i++) {
            int dias = 0;

            int dia = sc.nextInt();
            int mes = sc.nextInt();

            dias += diasMes[mes - 1] - dia; 

            for (int j = mes; j < diasMes.length; j++) {
                dias += diasMes[j];
            }
            System.out.println(dias);
        }
    }
}
