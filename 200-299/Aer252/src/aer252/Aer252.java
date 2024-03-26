package aer252;

import java.util.Scanner;

public class Aer252 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input;
        while (!((input = sc.nextLine()).equals("XXX"))) {
            String fraseInversa = "";
            input = input.toLowerCase().replaceAll("\\s", "");
            for (int i = 0; i < input.length(); i++) {
                fraseInversa += input.charAt(input.length() - 1 - i);
            }
            System.out.println(input.equals(fraseInversa)?"SI":"NO");
        }
    }
    
}
