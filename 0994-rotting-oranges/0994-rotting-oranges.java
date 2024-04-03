class Solution {
    public int orangesRotting(int[][] grid) {
        
        int row = grid.length;
        int col = grid[0].length;
        
        int direction[][] = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
        
        int fresh = 0;
        
        Queue<int[]> q = new ArrayDeque<>();
        
        for(int i =0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j] == 2){
                    q.offer(new int[]{i, j});
                }
                else if(grid[i][j] == 1){
                    fresh++;
                    
                }
                
            }
        }
        
        int min = 0;
        while(!q.isEmpty() && fresh > 0){
            int size = q.size();
            
            for(int i =0; i<size; i++){
                int[] curr = q.poll();
                
                for(int[] dir : direction){
                    int nrow = curr[0] + dir[0];
                    int ncol = curr[1] + dir[1];
                    
                    if(nrow>=0 && nrow<row && ncol >= 0 && ncol<col && grid[nrow][ncol] == 1){
                        grid[nrow][ncol] = 2;
                        fresh--;
                        q.offer(new int[]{nrow, ncol});
                    }
                    
                 }
                
                
            }
            min++;
        }
        
        return fresh == 0 ? min : -1;
        
    }
}