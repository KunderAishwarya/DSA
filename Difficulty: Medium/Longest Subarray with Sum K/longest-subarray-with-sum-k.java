// User function Template for Java

class Solution {
    public int longestSubarray(int[] arr, int k) {
        // code here
        HashMap<Integer,Integer> sumMap = new HashMap<>();
        sumMap.put(0,-1);
        int currSum =0;
        int maxLen = 0;
        
        for(int i =0 ; i< arr.length; i++){
            currSum += arr[i];
            if(sumMap.containsKey(currSum-k)){
                maxLen = Math.max(maxLen, i-sumMap.get(currSum-k));
            }
            if(!sumMap.containsKey(currSum)){
                sumMap.put(currSum,i);
            }
        }
        return maxLen;
    }
}
