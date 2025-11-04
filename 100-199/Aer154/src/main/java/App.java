import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numeros;
        String letras;
        for (numeros = sc.nextInt(), letras = sc.next(); numeros != 9999 || !letras.equals("ZZZ"); numeros = sc.nextInt(), letras = sc.next()) {
            numeros++;
            boolean b = numeros >= 10000;
            numeros %= 10000;

            char[] chars = letras.toCharArray();
            if (b) {
                if (chars[2] == 'Z') {
                    chars[2] = 'B';
                    if (chars[1] == 'Z') {
                        chars[1] = 'B';
                        if (chars[0] == 'Z') {
                            chars[0] = 'B';
                        } else {
                            if (++chars[0] == 'Ñ' || isVowel(chars[0])) {
                                chars[0]++;
                            }
                        }
                    } else {
                        if (++chars[1] == 'Ñ' || isVowel(chars[1])) {
                            chars[1]++;
                        }
                    }
                } else {
                    if (++chars[2] == 'Ñ' || isVowel(chars[2])) {
                        chars[2]++;
                    }
                }
            }

            System.out.println(String.format("%04d", numeros) + " " + new String(chars));
        }
    }

    private static boolean isVowel(char c) {
        return "AEIOU".indexOf(c) != -1;
    }

}
