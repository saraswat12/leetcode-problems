class Solution {

    public void back(String curr, int open, int close, List<String> list, int n){
        if(curr.length() == 2*n){
            list.add(curr);
            return;
        }
        
        if(open < n){
            back(curr + "(", open +1, close, list, n);
        }
        if(close < open){
            back(curr+")", open, close+1, list, n);
        }
    }

    public List<String> generateParenthesis(int n) {

        List<String> list = new ArrayList<>();

        back("(", 1, 0, list, n);

        return list;




        
    }
}