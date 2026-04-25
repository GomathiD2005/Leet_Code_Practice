class Solution {
    public boolean isPalindrome(String s) {
   s=s.toLowerCase();
   String cleaned=s.replaceAll("[^a-z0-9]","");
  StringBuilder sb=new StringBuilder(cleaned);
   String reverse =sb.reverse().toString();
 if(cleaned .equals(reverse)){
    return true;
 }
   return false;
    }
}