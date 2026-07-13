class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans =0;
        for(char s : stones.toCharArray()){
            for (char j : jewels.toCharArray()){
                if (s == j){
                    ans++ ;
                }
            }
        }
        return ans;
    }
    
}