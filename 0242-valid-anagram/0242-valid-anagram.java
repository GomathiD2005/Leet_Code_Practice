class Solution {
    public boolean isAnagram(String s, String t) {   
        if (s.length() != t.length()) {
            return false;
        }

        char[] c = s.toCharArray();
        char[] ch = t.toCharArray();

        Arrays.sort(c);
        Arrays.sort(ch);

        if(Arrays.equals(c, ch)){
            return true;

        }
        else{
            return false;
        }
    }
}