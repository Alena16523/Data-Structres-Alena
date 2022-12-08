package ExtraTasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindAllElementsGreaterThanTheirRight {

    public static void main(String[] args) {
        System.out.println(findAllElementGreaterThanTheirRight(new int[]{10, 4, 6, 3, 5, 9, 7, 4, 8, 12}));
    }


    public static List<Integer> findAllElementGreaterThanTheirRight(int[] arr) {

        Stack<Integer> stack = new Stack<>(); //O(n) creating new space

        for (int num : arr) {
            while (!stack.isEmpty() && num > stack.peek()) {
                stack.pop();
            }
            stack.push(num);
        }

        return new ArrayList<>(stack);
    }
}
