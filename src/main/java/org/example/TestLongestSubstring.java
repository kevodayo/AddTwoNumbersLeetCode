package org.example;

import java.util.HashSet;

public class TestLongestSubstring {

    public static int test(String s){
        int maximumLength = 0;
        int right = 0;
        int left = 0;

        HashSet<Character> uniqueChar = new HashSet<>();
        while (right < s.length()){
            char currentChar = s.charAt(right);
            if(!uniqueChar.contains(currentChar)){
                uniqueChar.add(currentChar);
                right++;
                maximumLength = Math.max(maximumLength, uniqueChar.size());
            }else {
                uniqueChar.remove(s.charAt(left));
                left ++;
            }
        }
        return maximumLength;
    }
}
