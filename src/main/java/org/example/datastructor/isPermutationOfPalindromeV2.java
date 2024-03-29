package org.example.datastructor;

public class isPermutationOfPalindrome {
    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("aa bb cc dd"));
        System.out.println(isPermutationOfPalindrome("aa bb cc dd e"));
        System.out.println(isPermutationOfPalindrome("aa bb cc dd e fff"));
    }

    //시간 복잡도 O(n)
    private static boolean isPermutationOfPalindrome(String s) {
        int[] table = buildCharFrequencyTable(s);
        return checkMaxOneOdd(table);
    }



    private static int[] buildCharFrequencyTable(String s) {
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c : s.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }

    private static int getCharNumber(char c) {
        int a = Character.getNumericValue('a'); //각 코드의 ASCII 값
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);

        if (a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }
    private static boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count : table) {
            if (count % 2 == 1) {
                if (!foundOdd) {
                    foundOdd = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}

