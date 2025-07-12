class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums == null || nums.length ==0){return 0;}
        HashSet<Integer> set= new HashSet<Integer>();
        int longest = Integer.MIN_VALUE;
        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num -1)){
            int curr =  num;
            int count = 1;
            while(set.contains(curr + 1)){
                count++;
                curr++;
            }
        longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}