import java.util.Map;

import static java.util.Map.entry;

public class NumberLetterCounts {
    public static void main(String[] args) {
        // map of numbers to words
        Map<Integer, String> map = Map.ofEntries(
            entry(1, "one"),
            entry(2, "two"),
            entry(3, "three"),
            entry(4, "four"),
            entry(5, "five"),
            entry(6, "six"),
            entry(7, "seven"),
            entry(8, "eight"),
            entry(9, "nine"),
            entry(10, "ten"),
            entry(11, "eleven"),
            entry(12, "twelve"),
            entry(13, "thirteen"),
            entry(14, "fourteen"),
            entry(15, "fifteen"),
            entry(16, "sixteen"),
            entry(17, "seventeen"),
            entry(18, "eighteen"),
            entry(19, "nineteen"),
            entry(20, "twenty"),
            entry(30, "thirty"),
            entry(40, "forty"),
            entry(50, "fifty"),
            entry(60, "sixty"),
            entry(70, "seventy"),
            entry(80, "eighty"),
            entry(90, "ninety"),
            entry(100, "hundred"),
            entry(1000, "thousand")
        );

        // get number of letters 1-9
        int lettersIn9 = countNums(1, 10, map);
        // get number of letters 10-19
        int lettersInTeens = countNums(10, 20, map);
        // get number of letters 1-99
        int lettersIn99 = 0;
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                lettersIn99 += lettersIn9;
            } else if (i == 1) {
                lettersIn99 += lettersInTeens;
            } else {
                lettersIn99 += lettersIn9 + (map.get(i*10).length()*10);
            }
        }
        int lettersIn1000 = 0;
        int and = "and".length() * 99;
        // get number of letters 1-999
        for (int i = 0; i < 10; i++) {
            if (i == 0) {
                lettersIn1000 += lettersIn99;
            } else {
                lettersIn1000 += lettersIn99 + (map.get(i).length() + map.get(100).length()) * 100 + and;
            }
        }
        // add 1000
        lettersIn1000 += map.get(1000).length() + map.get(1).length();
        System.out.println(lettersIn1000);
    }

    // count number of letters in a range
    public static int countNums(int start, int end, Map<Integer, String> map) {
        int count = 0;
        for (int i = start; i < end; i++) {
            count += map.get(i).length();
        }
        return count;
    }
}
