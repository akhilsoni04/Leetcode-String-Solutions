import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagrams {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();
        if(s.length() < p.length()) return result;

        int[] sCount = new int[26];
        int[] pCount = new int[26];

        for(char ch: p.toCharArray()){
            pCount[ch - 'a']++;
        }

        int windowSize = p.length();

        for(int i=0; i<s.length(); i++){
            sCount[s.charAt(i) - 'a']++;

            if(i>= windowSize){
                sCount[s.charAt(i - windowSize) - 'a']--;
            }

            if(Arrays.equals(pCount , sCount)){
                result.add(i - windowSize + 1);
            }
        }
        return result;
    }
}