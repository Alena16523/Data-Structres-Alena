package ExtraTasks;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        System.out.println(getNumber("CDA"));
        System.out.println(forLoopStartingFromEnd("BCM"));
        System.out.println(forLoopStartingFromBeginning("BCM"));
        System.out.println(withRecursion("BCM"));
    }


    public static int getNumber(String columnTitle) {

        int number = 0;
        for (int i = columnTitle.length() - 1, j = 0; i >= 0; i--, j++) {
            number += (columnTitle.charAt(i) - 'A' + 1) * Math.pow(26, j);
        }

        return number;
    }

    public static int forLoopStartingFromEnd(String title) {
        int total = 0;
        int multiplier = 1;
        for (int i = title.length() - 1; i >= 0; i--) {
            total += (title.charAt(i) - 'A' + 1) * multiplier;
            multiplier = multiplier * 26;
        }
        return total;
    }

    public static int forLoopStartingFromBeginning(String title) {
        int result = 0;
        int digitOrder = title.length() - 1;

        for (char c : title.toCharArray()) {
            result += (c - 'A' + 1) * Math.pow(26, digitOrder--);
        }
        return result;
    }

    public static int withRecursion(String title) {

        if (title.length() == 0) {
            return 0;
        }

        return (title.charAt(title.length() - 1) - 'A' + 1)
                + 26 * withRecursion(title.substring(0, title.length() - 1));
    }

}
