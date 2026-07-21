class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>map = new HashMap<>();
        for( char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0) +1);
        }
        int ans = 0;
        boolean isOdd = false;
        for( int v : map.values()){
            if (v % 2  == 0)
                ans += v;
            else{
                ans += v-1;
                isOdd = true;
            }
        }
        return isOdd ? ans + 1 : ans ;
        
    } 
    
}