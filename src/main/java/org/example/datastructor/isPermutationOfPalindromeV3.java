package org.example.datastructor;

public class isPermutationOfPalindromeV2 {
    public static void main(String[] args) {
        System.out.println(isPermutationOfPalindrome("aa bb cc dd"));
        System.out.println(isPermutationOfPalindrome("aa bb cc dd e"));
        System.out.println(isPermutationOfPalindrome("aa bb cc dd e fff"));
    }

    //시간 복잡도 O(n)
    private static boolean isPermutationOfPalindrome(String s) {
        int countOdd = 0;
        int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for (char c: s.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
                if (table[x] % 2 == 1) {
                    countOdd++;
                } else {
                    countOdd--;
                }
            }
        }
        return countOdd <= 1;
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

}

