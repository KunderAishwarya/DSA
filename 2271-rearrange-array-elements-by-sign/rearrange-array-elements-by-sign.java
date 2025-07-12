class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int neg = 1;
        int pos = 0;
        for(int i=0; i < n; i++){
            if(nums[i]>0){
                res[pos] = nums[i];
                pos+=2;
            }else{
                res[neg] = nums[i];
                neg+=2;
            }
        }
        return res;
    }
}