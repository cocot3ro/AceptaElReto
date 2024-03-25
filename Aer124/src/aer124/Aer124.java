package aer124;

import java.util.Scanner;

public class Aer124 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            String str1 = sc.next();
            String str2 = sc.next();
            if (str1.equals("0") && str2.equals("0")) {
                break;
            }
            int[] num1 = new int[Math.max(str1.length(), str2.length())];
            int[] num2 = new int[Math.max(str1.length(), str2.length())];
            
            for (int i = 0; i < str1.length(); i++) {
                num1[i] = Integer.parseInt(str1.charAt(str1.length() - 1 - i) + "");
            }
            
            for (int i = 0; i < str2.length(); i++) {
                num2[i] = Integer.parseInt(str2.charAt(str2.length() - 1 - i) + "");
            }
            
            int vecesAcarreo = 0;
            int acarreo = 0;
            
            for (int i = 0; i < num1.length; i++) {
                if ((num1[i] + num2[i] + acarreo) > 9) {
                    vecesAcarreo++;
                    acarreo = 1;
                } else {
                    acarreo = 0;
                }
            }
            System.out.println(vecesAcarreo);
        }
    }
}
