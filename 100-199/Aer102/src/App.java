import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final String END_CASE = "FIN";

        while (true) {
            String input = sc.nextLine();

            String decrypted = decrypt(input);

            if (decrypted.equals(END_CASE)) {
                break;
            }

            System.out.println(countVowels(decrypted));
        }
    }

    private static String decrypt(String input) {
        char firstChar = input.charAt(0);
        if (firstChar == 'p') {
            return input.substring(1);
        }

        int offset = firstChar - 'p';
        StringBuilder decrypted = new StringBuilder();

        for (int i = 1; i < input.length(); i++) {
            if (!isLetter(input.charAt(i))) {
                decrypted.append(input.charAt(i));
                continue;
            }

            char c = input.charAt(i);
            char base = Character.isLowerCase(c) ? 'a' : 'A';
            char decryptedChar = (char) ((c - base - offset + 26) % 26 + base);

            decrypted.append(decryptedChar);
        }

        return decrypted.toString();
    }

    private static int countVowels(String input) {
        int count = 0;

        for (char c : input.toCharArray()) {
            if (isVowel(c)) {
                count++;
            }
        }

        return count;
    }

    private static boolean isLetter(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    private static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}