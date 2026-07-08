class Solution {
    public String longestPalindrome(String s) {
        int n = s.length();
        int max = 0 , l = 0 , r = 0;
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
                if(j-i+1 > max){
                    max = j-i+1;
                    l = i;
                    r = j;
                }
              }
            }
        }
        return s.substring(l,r+1);
    }
}