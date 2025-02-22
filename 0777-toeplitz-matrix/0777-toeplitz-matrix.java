class Solution {
    public boolean isToeplitzMatrix(int[][] mat) {
       int m= mat.length, n = mat[0].length;
       for(int d = m-1; d > -n; d--){
        int row = (d >= 0) ? d : 0;
        int col = (d >= 0) ? 0  : -d;
        int firstvalue = mat[row][col];
        while(row < m && col < n){
           if(mat[row][col] != firstvalue) return false;
           row++;col++;
        }
       } 
       return true;
    }
}