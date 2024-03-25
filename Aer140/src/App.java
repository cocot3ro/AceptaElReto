import java.util.Scanner;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int numero = sc.nextInt(); numero >= 0; numero = sc.nextInt()) {
            Stack<Integer> pila = new Stack<>();
            String entrada = numero + "";

            for (int j = 0; j < entrada.length(); j++) {
                pila.add(Integer.parseInt(entrada.charAt(j) + ""));
            }

            String salida = "";
            int suma = 0;
            boolean b = true;

            while (!pila.isEmpty()) {
                Integer dato = pila.pop();
                salida = dato + (!b ? " + " + salida : "");
                if (b) b = false;
                suma += dato;
            }
            System.out.println(salida + " = " + suma);
        }

        sc.close();
    }
}
