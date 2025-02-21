class Solution {
    public int[][] transpose(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = i; j < matrix[0].length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        return matrix;
    }
    public void rotate90(int[][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length / 2; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix[0].length - 1 - j];
                matrix[i][matrix[0].length - 1 - j] = temp;
            }
        }
    }
    public void rotate(int[][] matrix) {
        matrix = transpose(matrix);
        rotate90(matrix);
    }
}