class Solution {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> st = new Stack<>();

        for(int i =0; i<tokens.length; i++){
            String token = tokens[i]; // Integer.parseInt(tokens[i])
            if(token.length() == 1 && "+-/*".contains(token)){
            char curr = token.charAt(0);

             if (st.size() < 2) {
                    throw new IllegalArgumentException("Invalid expression");
                }
                int a = st.pop();
                 int b = st.pop();
               
            if(curr == '+'){
                st.push(b+a);
            }
            else if(curr == '*'){
                st.push(b*a);
            }
             else if(curr == '-'){
                st.push(b-a);
            }

            else if(curr == '/'){
               
                  if (a == 0) {
                        throw new ArithmeticException("Division by zero");
                    }
                st.push(b/a);
            }

            }
            else{
                st.push(Integer.parseInt(token));
            }
            

        }

        if (st.size() != 1) {
            throw new IllegalArgumentException("Invalid expression");
        }

        return st.pop();



    }
}