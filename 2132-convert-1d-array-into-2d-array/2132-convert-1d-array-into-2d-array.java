class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
       
       if(original.length != m*n) return new int[0][0];
        int[][] res = new int[m][n];
       int row = 0 , col = 0;
        for(int i = 0; i < original.length; i++){
          row = i / n;
          col = i % n;
         res[row][col] = original[i];
        }
        return res;
    }
}