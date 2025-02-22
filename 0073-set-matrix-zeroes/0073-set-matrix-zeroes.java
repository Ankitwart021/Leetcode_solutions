import java.util.*;

class Solution {
    public void fillColumn(int[][] mat, int col, int m) {
        for (int i = 0; i < m; i++) {
            mat[i][col] = 0;
        }
    }

    public void fillRow(int[][] mat, int row, int n) {
        for (int i = 0; i < n; i++) {
            mat[row][i] = 0;
        }
    }

    public void setZeroes(int[][] mat) {
        int m = mat.length, n = mat[0].length;
        List<Integer> ridx = new ArrayList<>();
        List<Integer> cidx = new ArrayList<>();

        // Step 1: Find positions of all zeroes
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0) {
                    ridx.add(i);
                    cidx.add(j);
                }
            }
        }

        // Step 2: Fill rows & columns with zeroes
        for (int k = 0; k < ridx.size(); k++) {
            fillRow(mat, ridx.get(k), n);
            fillColumn(mat, cidx.get(k), m);
        }
    }
}
