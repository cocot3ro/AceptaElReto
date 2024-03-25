import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = Integer.parseInt(sc.nextLine()); i > 0; i--) {
            String nombre = sc.nextLine();
            String parentesco = sc.nextLine();
            if (nombre.equals("Luke") && parentesco.equals("padre")) {
                System.out.println("TOP SECRET");
            } else {
                System.out.println(nombre + ", yo soy tu " + parentesco);
            }
        }
    }
}
