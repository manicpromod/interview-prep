package com.manicpromod.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
https://leetcode.com/problems/longest-substring-without-repeating-characters/

Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
**/



public class LongestSubstring {

public int lengthOfLongestSubstring(String s) {

int lp=0;
int rp=0;
int max=0;
Set set = new HashSet<>();
while(rp < s.length()) {
  if(!set.contains(s.charAt(rp))) {
    set.add(s.charAt(rp++));
    max=Math.max(max,set.size());
  } else {

    set.remove(s.charAt(lp++));

  }

}

return max;
}


}
