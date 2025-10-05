class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = searchFirst(nums, target);
        int second = searchSecond(nums, target);
        return new int[]{first, second};
    }
    public int searchFirst(int[] nums, int target){
        int st = 0;
        int end = nums.length - 1;
        int first = -1;
        
        
        while(st <= end){
            int m = st + (end - st)/2;
            if(nums[m] == target){
                first = m;
                end = m - 1;
            }else if(nums[m] < target){
                st = m + 1;
            }else{
                end = m - 1;
            }
        }
        return first;
    }
    public int searchSecond(int[] nums, int target){
        int st = 0;
        int end = nums.length - 1;
        int second = -1;
        
        
        while(st <= end){
            int m = st + (end - st)/2;
            if(nums[m] == target){
                second = m;
                st = m + 1;
            }else if(nums[m] < target){
                st = m + 1;
            }else{
                end = m - 1;
            }
        }
        return second;
    }
}