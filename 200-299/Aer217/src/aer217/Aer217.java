package aer217;

import java.util.Scanner;

public class Aer217 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        while (num != 0 && num <= 1000) {
            System.out.println(num % 2 == 0?"DERECHA":"IZQUIERDA");
            num = sc.nextInt();
        }
    }
}
