class Solution {
    public String reverseWords(String s) {
String[] words = s.trim().split(" ");           // Split sentence into words
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder revword = new StringBuilder(words[i]);  // take the actual word
            result.append(revword.reverse());                     // reverse it and add
            if (i < words.length - 1) {                           // add space between words
                result.append(" ");
            }
        }
        return result.toString();        
    }    
}
    
