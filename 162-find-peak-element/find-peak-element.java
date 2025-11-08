class Solution {
    public int findPeakElement(int[] nums) {
        int st = 0;
        int end = nums.length - 1;
        while(st < end){
            int m = st + (end - st)/2;
            if(nums[m] > nums[m+1]){
                end = m;
            }else{
                st = m+1;
            }
        }
        return st;
    }
}