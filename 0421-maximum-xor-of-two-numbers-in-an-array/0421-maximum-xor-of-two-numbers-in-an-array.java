class Solution {
    class Node{
        Node zero,one;
        Node(){
            this.zero = this.one = null;
        }
    }
    Node root = new Node();
    void insert(int num){
        Node cur = root;
        for(int i = 31; i>=0; i--){
            int bit = (num>>i) & 1;
            if(bit == 0){
                if(cur.zero == null)cur.zero = new Node();
                cur = cur.zero;
            }else {
                if(cur.one == null) cur.one = new Node();
                cur = cur.one;
            }
        }
    }
    int getMaxXor(int num){
        int maxXor = 0;
        Node cur = root;
        for(int i = 31; i>= 0; i--){
            int bit = (num>>i)& 1;
            if(bit == 0){
                if(cur.one != null){
                    maxXor += 1<<i;
                    cur = cur.one;
                }else cur = cur.zero;
            }else {
                if(cur.zero != null){
                    maxXor += 1<<i;
                    cur = cur.zero;
                }else cur = cur.one;
            }
        }
        return maxXor;
    }
    public int findMaximumXOR(int []nums){
        int ans = 0;
        for (int a : nums){
            insert(a);
        }
        for (int a : nums){
            ans = Math.max(ans,getMaxXor(a));
        }
        return ans;
    }
}
