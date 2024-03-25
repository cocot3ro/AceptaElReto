import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next().toLowerCase();
            for (int i = 1; i <= input.length(); i++) {
                String subString = input.substring(0, i);
                if (esCiclica(input, subString)) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }

    private static boolean esCiclica(String input, String subString) {
        int inputLength = input.length();
        int subStringLength = subString.length();
        if (inputLength % subStringLength != 0) {
            return false;
        }

        for (int i = 0, nextIndex = 0; i < inputLength / subStringLength; i++) {
            int idx = input.indexOf(subString, nextIndex);
            if (idx == -1) {
                return false;
            }
            nextIndex = idx + subStringLength;
        }

        return true;
    }
}
