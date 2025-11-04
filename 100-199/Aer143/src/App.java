import java.util.*;

public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Scanner sc = new Scanner(System.in);

        while (true) {
            Stack<Integer> stack = new Stack<>();
            int tortilla;
            while ((tortilla = sc.nextInt()) != -1) {
                stack.push(tortilla);
            }

            if (stack.isEmpty()) break;

            int[] flips = new int[sc.nextInt()];

            for (int i = 0; i < flips.length; i++) {
                flips[i] = sc.nextInt();
            }

            // Using Stack
//            System.out.println(solution.stackApproach(stack, flips));

            // Using array
            System.out.println(solution.arrayApproach(stack.toArray(new Integer[0]), flips));
        }
    }
}

class Solution {
    public int arrayApproach(Integer[] array, int[] flips) {
        for (int flip : flips) {
            flip(array, flip);
        }

        return array[array.length - 1];
    }

    private void flip(Integer[] array, int n) {
        int l = array.length - n - 1;
        int r = array.length;

        while (++l < --r) {
            int temp = array[l];
            array[l] = array[r];
            array[r] = temp;
        }
    }

    public int stackApproach(Stack<Integer> stack, int[] flips) {

        for (int flip : flips) {
            flip(stack, flip);
        }

        return stack.pop();
    }

    private void flip(Stack<Integer> stack, int n) {
        List<Integer> list = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            list.add(stack.pop());
        }

        stack.addAll(list);
    }
}