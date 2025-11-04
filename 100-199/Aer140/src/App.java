import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution solution = new Solution();

        for (int numero = sc.nextInt(); numero >= 0; numero = sc.nextInt()) {
            System.out.println(solution.sumaDeDigitos(numero));
        }
    }
}

class Solution {
    public String sumaDeDigitos(int numero) {
        if (numero < 10) {
            return numero + " = " + numero;
        }

        StringBuilder sb = new StringBuilder();

        int suma = 0;
        while (numero > 0) {
            sb.insert(0, " + " + numero % 10);
            suma += numero % 10;
            numero /= 10;
        }

        return sb.substring(3) + " = " + suma;
    }
}