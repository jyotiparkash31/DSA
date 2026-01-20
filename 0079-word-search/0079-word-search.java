class Solution {
    public boolean exist(char[][] board, String word) {
        boolean[][] visited=new boolean[board.length][board[0].length];
        boolean result=false;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                     result=solve(i,j,board,word,visited,0);
                     if(result)return true;
                }
            }
        }
        return false;
    }
    public boolean solve(int i,int j,char[][] board,String word,boolean[][] visited,int index){
        if(index==word.length())return true;
        if(i<0||i>=board.length || j<0 ||j>=board[0].length|| visited[i][j]|| board[i][j]!=word.charAt(index)){
            return false;
        }
        visited[i][j]=true;
        if(solve(i+1,j,board,word,visited,index+1)||solve(i-1,j,board,word,visited,index+1)
        || solve(i,j+1,board,word,visited,index+1)||solve(i,j-1,board,word,visited,index+1)){
            return true;
        }
       visited[i][j]=false;
       return false;
    }
}
//agar start match with first char then go ahead line 8
//if index reaches the end of words the true and we need to mark every cell visited or not visited