package aer148;

import java.util.Scanner;

public class Aer148 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String tiempo = sc.next();
        
        while (!tiempo.equals("00:00")) {
            int minutosRestantes;
            
            String[] partes = tiempo.split(":");
            int horario = Integer.parseInt(partes[0]);
            int minutero = Integer.parseInt(partes[1]);
            if (horario == 23) {
                minutosRestantes = 60 - minutero;
            } else {
                minutosRestantes = (60 - minutero)+(23 - horario)*60;
            }
            
            System.out.println(minutosRestantes);
            
            tiempo = sc.next();
        }
    }
    
}
