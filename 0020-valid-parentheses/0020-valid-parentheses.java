class Solution {
    
    public boolean isOpening(char ch){
        return (ch == '(') || (ch == '{') || (ch == '[');
    }
    
    public boolean ismatch(char a, char b){
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }
  
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

            
            for(int i =0; i<s.length(); i++){
                
                char ch = s.charAt(i);
                
                if(isOpening(ch)){
                    stack.push(ch);
                }
                else{
                    if(stack.isEmpty()){
                        return false;
                    }
                    else if(!ismatch(stack.pop(), ch)){
                        return false;
                        
                    }
                }
                
            }
        
        return stack.isEmpty();


    }
}