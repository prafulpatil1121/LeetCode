class Solution {
    public int countSubstrings(String s) {
        int n = s.length();
        int count = 0;
        int [][]dp = new int[n][n];
        for(int k = 0; k<n; k++){
            for(int i = 0 ,j = k; j<n; i++, j++){
                if( i == j)
                dp[i][j] =1;
                else if(k == 1 && s.charAt(i) == s.charAt(j))
                dp[i][j] =1;
                else if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1] == 1 )
                dp[i][j] = 1;
              if(dp[i][j] == 1){
                count++;
                }
            }
        }
        return  count;
    }
}