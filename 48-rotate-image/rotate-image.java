class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            int m = n - 1;
            for (int j = 0; j < matrix[i].length/2; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][m];
                matrix[i][m] = temp;
                m--;
            }
        }

    }
}