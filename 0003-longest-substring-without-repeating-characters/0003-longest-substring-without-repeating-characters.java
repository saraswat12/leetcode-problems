class Solution {
    public int lengthOfLongestSubstring(String s) {
        
       int[] lastSeen = new int[128]; // Assuming ASCII characters
        Arrays.fill(lastSeen, -1);

        int maxLength = 0;
        int start = 0;

        for (int end = 0; end < s.length(); end++) {
            char current = s.charAt(end);

            // If the character is already in the substring, update the start pointer
            // to the next position after the last occurrence of the current character.
            if (lastSeen[current] != -1) {
                start = Math.max(lastSeen[current] + 1, start);
            }

            // Update the lastSeen index of the current character.
            lastSeen[current] = end;

            // Update the maximum length of the substring.
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;

    }
}