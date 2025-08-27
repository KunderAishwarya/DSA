class Solution {
    public int countNegatives(int[][] grid) {
        int count = 0;
        int j = grid[0].length - 1;
        int i = 0;
        int k = grid.length;
        while (j >= 0 && i < k) {

            if (grid[i][j] < 0) {
                count++;
                j--;
            } else {
                i++;
                if (i < k) {
                    j = grid[i].length - 1;
                }
            }
            if (j < 0) {
                i++;
                if (i < k) {
                    j = grid[i].length - 1;
                }
            }           
        }
        return count;
    }
}