class Solution {
    public boolean checkIfPangram(String s) {
     boolean[] seen = new boolean[26];

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                seen[ch - 'a'] = true;
            }
        }

        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }

        return true;
    }
    }