package aer156;

import java.util.Scanner;

public class Aer156 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int anterior, siguiente, suma;
        
        while(!((anterior = sc.nextInt()) < 0)) {
            
            suma = 0;
            while(!((siguiente = sc.nextInt()) == -1)) {
                
                if (anterior > siguiente) {
                    suma += (anterior - siguiente);
                } else if (anterior < siguiente) {
                    suma += (siguiente - anterior);
                }
                anterior = siguiente;
            }
            System.out.println(suma);
        }
    }
}
