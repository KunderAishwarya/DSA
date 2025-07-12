class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        //test
        int prefix = 0;
        int count = 0;
        int xor = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i < arr.length; i++){
            prefix ^=arr[i];
            if(prefix == k){
                count ++;
            }
            xor = prefix ^ k;
            
                count += map.getOrDefault(xor,0);
            
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}