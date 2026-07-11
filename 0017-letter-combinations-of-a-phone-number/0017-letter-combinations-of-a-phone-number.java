class Solution {
     private void fn(String digits, List<String> ans, String cur, int i, String[] val) {
        if( i == digits.length()){
            ans.add(cur);
            return;
        }
        String key = val[digits.charAt(i) - '0'];
        for (int j = 0; j <  key.length(); j++) {
            fn(digits,ans,cur+key.charAt(j),i+1,val);

        }
    }
         public List<String> letterCombinations(String digits) {
             List<String> ans = new ArrayList<>();
             if (digits.length() == 0) {
                 return ans;

             }
             String val[] = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
             fn(digits, ans, "", 0, val);
             return ans; 
    }
}