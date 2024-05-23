class Solution {
    public String simplifyPath(String path) {
        
        String arr[] = path.split("/");
        Stack<String> s = new Stack<String>();
        
        for(String i : arr){
            if(i.equals("..") && !s.isEmpty()){
                s.pop();
                
            }
            else if(!i.equals("") && !i.equals("..") && !i.equals(".")){
                s.push(i);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(String j : s){
            sb.append("/");
            sb.append(j);
            
        }
        
        return sb.length() == 0 ? "/" : sb.toString();
        
    }
}