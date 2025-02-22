class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        for(int row = 0; row < m; row++){
            int min = 0;
            for(int col = 0; col < n; col++){
                if(mat[row][col] < mat[row][min]) min = col;
            }
            int max = 0;
            for(int r = 0; r < m; r++){
                if(mat[r][min] > max) max = mat[r][min];
            }
            if(max == mat[row][min]){
                List<Integer> ans = new ArrayList<>();
                ans.add(max);
                return ans;
            }
        }
        return new ArrayList<>();
    }
}