class Solution {
    
    public List<String> printcom(String str, int idx,  List<String> comb){
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        
        
        
        if(idx == str.length()){
            
            return comb;
        }
        
        char curr = str.charAt(idx);
        String mapping =  keypad[curr - '0'];
        
       List<String> newComb = new ArrayList<>();
        for (int i = 0; i < mapping.length(); i++) {
            for (String s : comb) {
                newComb.add(s + mapping.charAt(i));
            }
        }
        
        return printcom(str, idx + 1, newComb);
        
    }
    
    
    public List<String> letterCombinations(String digits) {
        
        
       List<String> comb = new ArrayList<>();
        if (digits.length() == 0) {
            return comb; // Return an empty list if input digits is empty
        }
        return printcom(digits, 0, Arrays.asList(""));
    }
}