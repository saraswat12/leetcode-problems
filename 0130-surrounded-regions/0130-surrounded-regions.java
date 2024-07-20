class Solution {
    
    public void convert(char[][] board){
        
          int row = board.length;
    int col = board[0].length;
        
        for(int i =0; i< row; i++){
           for(int j=0; j<col; j++){
               if(board[i][j] == 'B'){
                   board[i][j]= 'O';
               }
               else if(board[i][j] == 'O'){
                   board[i][j] = 'X';
               }
           }
        }
    }
    
    public boolean valid(char[][] board, int i, int row, int j, int col){
        
        if(i>=0 && i<row && j >= 0 && j<col && board[i][j] == 'O'){
            return true;
        }
        return false;
    }
    
    public void dfs(char[][] board, int i, int row, int j, int col){
        board[i][j] = 'B';
        
        if(valid(board, i+1, row, j, col)){
            dfs(board, i+1, row, j, col);
        }
        
         if(valid(board, i-1, row, j, col)){
            dfs(board, i-1, row, j, col);
        }
        
         if(valid(board, i, row, j+1, col)){
            dfs(board, i, row, j+1, col);
        }
        
         if(valid(board, i, row, j-1, col)){
            dfs(board, i, row, j-1, col);
        }
        
        
    }
    public void solve(char[][] board) {
        
        int row = board.length;
        int col = board[0].length;
        
       for(int i =0; i<row; i++){
           int j =0;
           if(board[i][j] == 'O'){
               dfs(board, i, row, j, col);
           }
           
            j =col-1;
           if(board[i][j] == 'O'){
               dfs(board, i, row, j, col);
           }
       }
        
        for(int j =0; j<col; j++){
           int i =0;
           if(board[i][j] == 'O'){
               dfs(board, i, row, j, col);
           }
           
             i =row-1;
           if(board[i][j] == 'O'){
               dfs(board, i, row, j, col);
           }
       }
        
        
        convert(board);
   
        
    }
}