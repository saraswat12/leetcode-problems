class Solution {
    
    public void swap(int[][] matrix, int i, int j, int x, int y){
        int temp = matrix[i][j];
        matrix[i][j] = matrix[x][y];
        matrix[x][y] = temp;
    }
    
   
    
    public void rotate(int[][] matrix) {
        
        
        int n = matrix.length;
        
        for(int i =0; i<n-1; i++){
            for(int j = i+1; j<n; j++){
                swap(matrix, i, j, j, i);
            }
        }
        
        for(int i =0; i<n; i++){
            reverse(matrix[i]);
            
        }
    }
        
        public void reverse(int[]mat){
        int start = 0;
        int end = mat.length-1;
        
        while(start<end){
            int temp = mat[start];
            mat[start] = mat[end];
            mat[end] = temp;
            start++;
            end--;
        }
    }
    
 
    
}