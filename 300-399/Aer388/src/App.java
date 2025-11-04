import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int cantidadPuntos = sc.nextInt(); cantidadPuntos != 0; cantidadPuntos = sc.nextInt()) {
            Punto[] puntos = new Punto[cantidadPuntos];
            for (int i = 0; i < puntos.length; i++) {
                puntos[i] = new Punto(sc.nextInt(), sc.nextInt());
            }

            int mayor = -1;

            for (int i = 0; i < puntos.length; i++) {
                for (int j = i + 1; j < puntos.length; j++) {
                    int dist = puntos[i].dist(puntos[j]);
                    if (dist > mayor) {
                        mayor = dist;
                    }
                }
            }
            System.out.println(mayor);
        }
    }
}

class Punto {
    int x;
    int y;

    Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    int dist(Punto p) {
        return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
    }
}
