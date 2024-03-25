package aer117;

import java.util.Scanner;

public class Aer117 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int personas = sc.nextInt();
        for (int i = 0; i < personas; i++) {
            sc.next();
            String nombre = sc.next();
            System.out.println("Hola, " +nombre+ ".");
        }
    }
    
}
