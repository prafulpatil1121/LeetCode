class Solution {
    public void fn(String s, List<List<String>> ans,List<String> list,boolean dp[][] , int i){
        if(i == s.length()){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int j = i; j < s.length();j++){
            if(dp[i][j]){
                String t = s.substring(i,j+1);
                list.add(t);
                fn(s,ans,list,dp,j+1);
                list.remove(list.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        int n = s.length();
        boolean dp[][] = new boolean[n][n];
        for(int k = 0 ; k < n; k++){
            for(int i = 0 , j = k ; j<n; i++,j++){
                if(i == j)
                dp[i][j] = true;
                else if(s.charAt(i) == s.charAt(j) && j-i == 1)
                dp[i][j] = true;
                else if(s.charAt(i) == s.charAt(j) && dp[i+1][j-1])
                dp[i][j] = true;
            }
        }
        List<List<String>> ans = new ArrayList<>();
        List<String> list = new ArrayList<>();
        fn(s,ans,list,dp,0);
        return ans;
    }
}