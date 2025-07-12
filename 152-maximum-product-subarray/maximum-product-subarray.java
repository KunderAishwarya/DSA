class Solution {
    public int maxProduct(int[] nums) {
        int maxProd = nums[0];
        int prefix = 1;
        int suffix = 1;
        int n = nums.length;
        for(int i =0;i< nums.length; i++){
            prefix = (prefix == 0 ? 1 : prefix) * nums[i];
            suffix = (suffix == 0 ? 1 : suffix) * nums[n-1-i];
            maxProd = Math.max(maxProd,Math.max(prefix,suffix));
        }
        return maxProd;
    }
}