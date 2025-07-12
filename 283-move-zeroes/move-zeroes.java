class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int pos = 0;
        int temp =0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[pos];
                nums[pos] = temp;
                pos++;
            }
        }
    
    }
}