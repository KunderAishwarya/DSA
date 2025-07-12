class Solution {
    public int maxSubArray(int[] nums) {
       int currSum =0; 
       int maxSumm = Integer.MIN_VALUE;
       for(int num : nums){
        currSum += num;
        maxSumm = Math.max(maxSumm, currSum);
        if(currSum < 0){
            currSum = 0;
        }
       } 
       return maxSumm;
    }
}