import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (String codigo = sc.next(); !codigo.equals("0"); codigo = sc.next()) {
            if (checkEan(codigo)) {
                System.out.print("SI");
                int length = codigo.length();

                if (length > 8) {

                    StringBuilder sb = new StringBuilder();

                    if (length < 13) {
                        for (int i = 13 - length; i > 0; i--) {
                            sb.append("0");
                        }
                        codigo = sb + codigo;
                    }

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
        int l = codigo.length();
        for (int i = 1; i < l; i++) {
            int digit = codigo.charAt(l - 1 - i) - '0';
            if (i % 2 == 1) {
                sum += (digit * 3);
            } else {
                sum += digit;
            }
        }

        return (sum + codigo.charAt(l - 1) - '0') % 10 == 0;
    }
}
