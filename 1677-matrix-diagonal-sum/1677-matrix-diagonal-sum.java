class Solution {
    public int diagonalSum(int[][] mat) {
       int n = mat.length;
       int sum = 0;
       int mid = n / 2;
       for(int i = 0; i < n; i++){
        sum += mat[i][i];
        sum += mat[i][n-1-i];
        
       }
       if(n % 2 == 1) sum -= mat[mid][mid];
       return sum; 
    }
}