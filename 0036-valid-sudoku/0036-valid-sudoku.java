class Solution {
    public boolean rowCheck(char[]row){
        Set<Character> set = new HashSet<>();
        for (int i = 0;i< row.length;i++){
            if(row[i] != '.') 
            if(set.contains(row[i]))
            return false;
            set.add(row[i]);
        }
        return true;
    }
    public boolean columnCheck(char[][]board,int j){
        Set<Character> set =new HashSet<>();
        for(int i = 0; i< board.length; i++){
            if(board[i][j] != '.'){
          if(set.contains(board[i][j]))
            return false;
            else
            set.add(board[i][j]);
            }
        }
        return true;
    }
    public boolean subSudukoCheck(char[][]board,int i,int j){
        Set<Character> set = new HashSet<>();
        for (int k=i; k< i+3;k++){
        for (int l=j; l< j+3; l++){
            if(board[k][l] != '.'){
                if(set.contains(board[k][l]))
                return false;
                else
                set.add(board[k][l]);
            }
        }
        }
        return true;

    }
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i<board.length;i++){
            if(!rowCheck(board[i]))
            return false;
            if(!columnCheck(board,i))
            return false;
        }
        for(int i = 0 ; i< board.length; i= i+3){
        for (int j = 0; j< board.length; j = j+3){
            if(!subSudukoCheck(board,i,j))
            return false;
        }
        }
        return true;
    }
}