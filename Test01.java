package com.exer02;

/**
 * @author Cavan
 * @date 2022-05-19
 * @qq 2069543852
 */
public class Test01 {
    public static void main(String[] args) {

        Solution solution = new Solution();
        String s = "We are happy";
        String s1 = solution.replaceSpace(s);
        System.out.println(s1);

    }
}

class Solution {
    public String replaceSpace(String s) {
        int length = s.length() * 3;
        char[] chars = new char[length];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                chars[size] = '%';
                chars[size + 1] = '2';
                chars[size + 2] = '0';
                size += 3;
            } else {
                chars[size] = c;
                size++;
            }
        }
        String newStr = new String(chars, 0, size);
        return newStr;
    }
}