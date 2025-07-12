class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        rev(0, n - 1,nums);
        rev(0, k - 1,nums);
        rev(k, n - 1,nums);

    }

    public void rev(int start, int end,int[] nums) {
        int temp;
        for (int i = start; i <= end; i++) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }

    }
}