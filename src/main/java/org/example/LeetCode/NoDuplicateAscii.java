package org.example.LeetCode;

public class NoDuplicateChar {
    public static void main(String[] args) {
        System.out.println(isUnique("abcdefgghijk"));
        System.out.println(isUnique("abcdefghijk"));
    }

    private static boolean isUnique(String str) {
        if (str.length() > 128) return false;
        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
