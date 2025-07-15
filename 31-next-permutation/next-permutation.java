class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        int j = n - 1;
        while (i>=0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if(i >= 0){
           while(nums[j] <= nums[i]){
                j--;
           }   
           swap(i,j, nums);         
        }
        reverse(i+1,n-1,nums);
        
    }
    public void swap(int start, int end, int[] nums){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    public void reverse(int start, int end, int[] nums){
        while(start < end){
            swap(start++, end--, nums);
        }
    }
   
}