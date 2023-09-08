package org.example;

import java.util.HashSet;

public class LongestSubstring {

    public static int longestSubString(String s1){

        int maxLength = 0;
        int left = 0; // Left pointer of the sliding window
        int right = 0; // Right pointer of the sliding window
        HashSet<Character> uniqueChars = new HashSet<>();

        while (right < s1.length()) {
            char currentChar = s1.charAt(right);
            if (!uniqueChars.contains(currentChar)) {
                uniqueChars.add(currentChar);
                right++;
                maxLength = Math.max(maxLength, uniqueChars.size());
            } else {
                uniqueChars.remove(s1.charAt(left));
                left++;
            }
        }

        return maxLength;
    }
}
