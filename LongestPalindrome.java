import java.util.*;
class Solution {
    public int longestPalindrome(String s) {
        int count = 0;
        Map<Character, Integer> map =  new HashMap<>();
        for(char ch:s.toCharArray()){
            map.put(ch ,map.getOrDefault(ch, 0) + 1);
            if(map.get(ch) %2 == 1){
                count++;
            }else {
                count--;
            }
        }
        if(count > 1){
            return s.length() - count + 1;
        }
        return s.length();
    }
}

// we are adding every character frequency 
// check the odd counts
// if count grater then 1 remove all odd count and store only one 