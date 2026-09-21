// Esquema de la entrada: número de casos

import java.util.Scanner;

public class Aer602 {

    static Scanner in;

    public static void casoDePrueba() {
        int centimos = in.nextInt();

        if (centimos <= 2) {
            System.out.println(centimos);
            return;
        }

        int dias = 2;

        int acc = 2;
        int ayer = 1;
        int anteayer = 1;

        while (acc < centimos) {
            int hoy = (ayer + anteayer * 2);
            acc += hoy;
            anteayer = ayer;
            ayer = hoy;
            dias++;
        }

        System.out.println(dias);
    } // casoDePrueba

    public static void main(String[] args) {

        in = new Scanner(System.in);

        int numCasos = in.nextInt();
        for (int i = 0; i < numCasos; i++)
            casoDePrueba();

    } // main

} // class Solution
