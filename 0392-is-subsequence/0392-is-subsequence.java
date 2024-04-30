class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int i = 0;
        int j =0;
        
        if(s.length()==0){
            return true;
        }
        
        while(j<t.length()){
            
            if(i == s.length()){
                return true;
            }
            
            
            if(s.charAt(i) == t.charAt(j)){
                i++;
            }
            j++;
        } 
        
        
        return i == s.length();
        
    }
}