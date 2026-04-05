class Solution {

    public int lengthOfLongestSubstring(String s) {
        int start =0;
        int end =0;
        int max_length =0;
        List<Character>List = new ArrayList<Character>();
        while(end < s.length()){
            if(!List.contains(s.charAt(end))){
                List.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length,List.size());
            }
            else{
                List.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }
}