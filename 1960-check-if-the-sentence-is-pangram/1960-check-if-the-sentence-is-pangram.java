class Solution {
    public boolean checkIfPangram(String str) {
        int[] count = new int[26];
        for(char x : str.toCharArray()){
            count[x - 'a']++;
        }
        for(int val : count){
            if(val < 1) return false;
        }
        return true;
    }
}