class Solution {
    class Node{
        Node children[];
        boolean eow;
        Node(){
            children = new Node[26];
            eow =  false;
        }
    }
    Node root = new Node();
    void insertion(String word ){
        Node cur = root;
        for (int i = 0; i <word.length() ; i++) {
            int index = word.charAt(i)-'a';
            if(cur.children[index] == null){
                cur.children[index] = new Node();
            }
            if( i == word.length()-1 )cur.children[index].eow = true;
            cur = cur.children[index];
        }
    }
    void solve (char[][] board, int i , int j , List<String> ans, boolean[][]isVis, Node curNode,String str){
        if(i>= board.length || j>= board[0].length || i<0 || j<0 || isVis[i][j]|| curNode.children[board[i][j] - 'a'] == null)return ;
        isVis[i][j] = true;
        curNode = curNode.children[board[i][j]- 'a'];
        if(curNode.eow){
            ans.add(str + board[i][j]);
            curNode.eow = false;
        }
        solve(board, i, j-1, ans, isVis, curNode, str + board[i][j]);
        solve(board, i-1, j, ans, isVis, curNode, str + board[i][j]);
        solve(board, i, j+1, ans, isVis, curNode, str + board[i][j]);
        solve(board, i+1, j, ans, isVis, curNode, str + board[i][j]);
        isVis[i][j] = false;
    }
    public List<String >findWords(char[][]board,String[]word){
        List<String >ans = new ArrayList<>();
        boolean isVis[][] = new boolean[board.length][board[0].length];
        for(int i = 0; i< word.length; i++){
            insertion(word[i]);
        }Node cur = root;
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
               int index = board[i][j]-'a';
               if(cur.children[index] != null){
                   solve(board,i,j,ans,isVis,cur,"");
               }
            }
        }
        return ans;
    }

}
