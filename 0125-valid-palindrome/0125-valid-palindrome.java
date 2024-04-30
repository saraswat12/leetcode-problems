class Solution {
    
    public String remove(String s){
        return s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    }
    
    
    public boolean isPalindrome(String s) {
        
        
        String newstr = remove(s);
        int l = 0;
        int r = newstr.length()-1;
        
        while(r>=l){
            if(newstr.charAt(l) == newstr.charAt(r)){
                l++;
                r--;
            }
            else{
                return false;
            }
        }
        
        return true;
        
        
        
        
        
    }
}