class Solution {
    public String removeOuterParentheses(String s) {
        
        
      
        int open = 0;
        int close = 0;
        StringBuilder str = new StringBuilder();
        int start = 0;
        
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                open++;
            }
            if(s.charAt(i) == ')'){
                close++;
            }
            
            if(open == close){
               str.append(s.substring(start+1, i));
                start = i+1; 
                 open = 0;
                close = 0;
               
               
            }
            
             
            
            
        }
        return str.toString();
        
        
        
    }
}