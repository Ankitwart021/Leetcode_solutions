class Solution {
    public boolean checkIfPangram(String str) {
        if(str.length() < 26) return false;
        int[] count = new int[26];
        for(char x : str.toCharArray()){
            count[x - 'a']++;
        }
        for(int val : count){
            if(val == 0) return false;
        }
        return true;
    }
}