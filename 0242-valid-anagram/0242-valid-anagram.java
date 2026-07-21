class Solution {
    public boolean isAnagram(String s, String t) {
       int freq[]= new int[26];
        for (char ch : s.toCharArray())
            freq[ch-97]++;
        int freq2[]= new int[26];
        for (char ch : t.toCharArray())
            freq2[ch-97]++;
        for (int i=0;i<26; i++){
            if (freq[i] != freq2[i]){
                return false;
            }
        }
        return true;  
    }
}