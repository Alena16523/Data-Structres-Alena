package tasks;

public class ValidPalindrome {

    public static void main(String[] args) {
        String str = "Do geese see God?";

        System.out.println(twoPointerRegex(str));
    }

    public static boolean twoPointerRegex(String str) {
        if (str == null || str.isBlank()) {
            return true;
        }
        String processedStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = processedStr.length() - 1;

        while (left < right) {
            if (processedStr.charAt(left) == processedStr.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}
