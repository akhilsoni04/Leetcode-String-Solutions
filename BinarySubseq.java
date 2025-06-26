public class BinarySubseq {
    public int longestSubsequence(String s, int k) {
        int count = 0;
        int power = 0;
        int n = s.length();
        long value = 0;

        for(int i=n-1; i>=0; i--){
            char c = s.charAt(i);

            if(c == '0'){
                count++;
            }else {
                if(power< 32){
                    long add = 1L << power;
                    if(value + add <= k){
                        value += add;
                        count++;
                    }
                }
            }
            power++;
        }
        return count;
    }
    
}
// Time Complexity: O(n)
// Space Complexity: O(1)