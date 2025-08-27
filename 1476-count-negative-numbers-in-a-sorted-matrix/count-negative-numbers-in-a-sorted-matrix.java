class Solution {
    public int countNegatives(int[][] grid) {
        int k = grid.length;
        int count = 0;
        int m = 0;
        int n = grid[0].length -1;
        while(m < k && n >= 0){
            if(grid[m][n] < 0){
                count += k - m;
                n--;
            }else{
                m++;                
            } 
        }
        return count;
    }
}