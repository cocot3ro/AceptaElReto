import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        for (int b = sc.nextInt(); b != 0; b = sc.nextInt()) {
            int[] numeros = new int[b];
            Set<Integer> arbol = new TreeSet<>();
            for (int i = 0; i < b; i++) {
                numeros[i] = sc.nextInt();
            }

            for (int i = 0; i < numeros.length; i++) {
                for (int j = i + 1; j < numeros.length; j++) {
                    arbol.add(Math.abs(numeros[i] - numeros[j]));
                }
            }

            String result = "";
            for (Integer integer : arbol) {
                result += integer + " ";
            }
            System.out.println(result.trim());
        }

        sc.close();
    }
}
