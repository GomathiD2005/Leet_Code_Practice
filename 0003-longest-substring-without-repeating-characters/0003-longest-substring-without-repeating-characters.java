class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        
        while(end < s.length()) {
            if(!set.contains(s.charAt(end))) {  // ✅ character check!
                set.add(s.charAt(end));
                end++;
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(s.charAt(start));    // ✅ 
                start++;
            }
        }
        
        return maxLength;
    }
}