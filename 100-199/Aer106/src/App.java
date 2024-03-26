import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (String codigo; !(codigo = sc.next()).equals("0"); ) {
            if (checkEan(codigo)) {
                System.out.print("SI");
                if (codigo.length() > 8) {
                    if (codigo.startsWith("380")) {
                        System.out.println(" Bulgaria");
                    } else if (codigo.startsWith("50")) {
                        System.out.println(" Inglaterra");
                    } else if (codigo.startsWith("0")) {
                        System.out.println(" EEUU");
                    } else if (codigo.startsWith("560")) {
                        System.out.println(" Portugal");
                    } else if (codigo.startsWith("70")) {
                        System.out.println(" Noruega");
                    } else if (codigo.startsWith("539")) {
                        System.out.println(" Irlanda");
                    } else if (codigo.startsWith("850")) {
                        System.out.println(" Cuba");
                    } else if (codigo.startsWith("890")) {
                        System.out.println(" India");
                    } else if (codigo.startsWith("759")) {
                        System.out.println(" Venezuela");
                    } else {
                        System.out.println(" Desconocido");
                    }
                } else {
                    System.out.println();
                }
            } else {
                System.out.println("NO");
            }
        }
    }

    private static boolean checkEan(String codigo) {
        int sum = 0;
        for (int i = 1; i < codigo.length(); i++) {
            int digit = Integer.parseInt(codigo.charAt(codigo.length() - 1 - i) + "");
            if (i % 2 == 1) {
                sum += (digit * 3);
            } else {
                sum += digit;
            }
        }

        return (sum + Integer.parseInt(codigo.charAt(codigo.length() - 1) + "")) % 10 == 0;
    }
}
