class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        List<Integer> ans = new ArrayList<>();
        List<Integer> idx = new ArrayList<>();
        
        for(int i = 0; i < m; i++){
            int min = Integer.MAX_VALUE;
            int collidx = -1;
            for(int j = 0; j < n; j++){
                if(mat[i][j] < min){
                    min = mat[i][j];
                    collidx = j;
                }
            
            }
            idx.add(collidx);
            ans.add(min);
        }
         List<Integer> luckyNumbers = new ArrayList<>();
        for(int k = 0; k < ans.size(); k++){
            int max = Integer.MIN_VALUE;
            int col = idx.get(k);
            for(int i = 0; i < m; i++){
                if(mat[i][col] > max) max = mat[i][col];

            }
            if(max == ans.get(k)) luckyNumbers.add(max);
        }
        return luckyNumbers;

    }
}