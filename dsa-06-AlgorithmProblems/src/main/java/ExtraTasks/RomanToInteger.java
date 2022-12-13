package ExtraTasks;

import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        System.out.println(romanToIntegerWithMap("MCMXCIV"));
        System.out.println(romanToIntegerWithSwitch("LVIII"));
    }


    public static int romanToIntegerWithMap(String s) {
        Map<Character, Integer> romanMap =
                Map.of('I', 1, 'V', 5, 'X', 10, 'L', 50,
                        'C', 100, 'D', 500, 'M', 1000);

        int current, prev = 0, total = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            current = romanMap.get(s.charAt(i));

            if (prev > current) {
                total -= current;
            } else {
                total += current;
            }
            prev = current;
        }

        return total;
    }

    public static int romanToIntegerWithSwitch(String s) {
        int current = 0, prev = 0, total = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            switch (s.charAt(i)) {
                case 'I':
                    current = 1;
                    break;
                case 'V':
                    current = 5;
                    break;
                case 'X':
                    current = 10;
                    break;
                case 'L':
                    current = 50;
                    break;
                case 'C':
                    current = 100;
                    break;
                case 'D':
                    current = 500;
                    break;
                case 'M':
                    current = 1000;
                    break;
                default:
                   return -1;

            }
            if (prev > current) {
                total -= current;
            } else {
                total += current;
            }
            prev = current;
        }

        return total;
    }
}
