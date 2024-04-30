class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i =0; i< numRows; i++){
            int idx = i;
            int south = 2*(numRows - 1 - i);
            int north = 2*i;
            boolean goingSouth = true;
            
            while(idx<s.length()){
                sb.append(s.charAt(idx));
                
                if(i==0){
                    idx+= south;
                }
                else if(i==numRows-1){
                    idx+=north;
                }
                else{
                    if(goingSouth){
                        idx+= south;
                    }
                    else{
                        idx+= north;
                    }
                    goingSouth = !goingSouth;
                }
            }
        }
        
        
        
        return sb.toString();
        
        
    }
}