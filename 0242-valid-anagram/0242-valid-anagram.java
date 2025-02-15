class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();
        for(int i = 0; i < s1.length; i++){
            for(int j = 0; j < s2.length; j++){
               if(s1[i] == s2[j]){ 
                s2[j] = ' ';
                break;}
               if(j == s2.length - 1) return false;
                
            }
        } 
        return true;
    }
}