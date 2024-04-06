class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        Arrays.sort(strs);
        String start = strs[0];
        String end = strs[strs.length -1];
       //tringBuilder sb = new StringBuilder();
        int idx = 0;
        
        while(idx < start.length() && start.charAt(idx) == end.charAt(idx)){
           
               idx++;
            
           
        }
        
        if(idx == 0){
            return "";
        }
        
        return start.substring(0, idx);
        
        
        
    }
}