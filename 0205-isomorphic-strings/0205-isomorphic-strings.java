class Solution {
    public boolean helper(String s1, String s2){
        char[] map = new char[256];
        for(int i = 0; i < s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);
            if(map[ch1] != '\u0000' && map[ch1] != ch2) return false;
            map[ch1] = ch2;
        }
        return true;
    }
    public boolean isIsomorphic(String s1, String s2) {
        return (helper(s1, s2) && helper(s2, s1));
    }
}