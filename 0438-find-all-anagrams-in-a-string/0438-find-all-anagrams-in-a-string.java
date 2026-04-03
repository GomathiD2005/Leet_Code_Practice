class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List <Integer> result = new ArrayList<>();
        if(p.length() > s.length()){
            return result;
        }
        int [] pcount =new int [26];
        int [] wcount =new int [26];
        int k = p.length();
         for(char c : p.toCharArray()) {
        pcount[c - 'a']++;
         }
        for(int i=0;i<k;i++){
            wcount [s.charAt(i) - 'a']++;

        }
        if(Arrays . equals (pcount,wcount)){
            result.add(0);
        
        }
        for(int i=k;i<s.length();i++){
            wcount [s.charAt (i) - 'a']++;
            wcount [s.charAt(i - k) -'a']--;

        
        if(Arrays.equals(pcount,wcount)){
            result.add(i-k + 1);
        }

        }
        return result;
    }

}