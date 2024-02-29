class Solution {

    public String conversion(String str){

        char[]  strArray = str.toCharArray();

        Arrays.sort(strArray);

        return new String(strArray);
    }

    public List<List<String>> groupAnagrams(String[] strs) {
      
         
        Map<String, List<String>> anagramMap = new HashMap<>();

        for (String str : strs) {
            String sortedStr = conversion(str);
            anagramMap.computeIfAbsent(sortedStr, key -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(anagramMap.values());


    }
}