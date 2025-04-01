class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix[0].length - 1; int m = matrix.length;
        int j = 0;
        for(int i = 0; i < m; i++){
        if(matrix[i][0] <= target && matrix[i][n] >= target){
            j = i;
        }
        }
        int left = 0, right = n;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(matrix[j][mid] == target){
                return true;
            }
            else if(matrix[j][mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
        }
        return false;
    }
}