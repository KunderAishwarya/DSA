class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int r : row) {
            for (int k = 0; k < matrix[r].length; k++) {
                matrix[r][k] = 0;
            }
        }
        for(int c : col){
            for(int l=0; l < matrix.length; l++){
                matrix[l][c] = 0;
            }
        }
    }
}