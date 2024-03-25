package aer362;

import java.util.Scanner;

public class Aer362 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int fecha = sc.nextInt();
        
        for (int i = 0; i < fecha; i++) {
            int dia = sc.nextInt();
            int mes = sc.nextInt();
            System.out.println(dia == 25 && mes == 12?"SI":"NO");
        }
    }
}
