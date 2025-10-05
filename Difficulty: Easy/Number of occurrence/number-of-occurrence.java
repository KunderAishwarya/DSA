class Solution {
    int countFreq(int[] arr, int target) {
        
        int first = searchFirst(arr, target);
        int last = searchLast(arr, target);
        if(first == -1){
            return 0;
        }
        int ans = last - first + 1;
        return ans;
    }
    
    public int searchFirst(int[] arr, int target){
        int st = 0;
        int end = arr.length - 1;
        int first = -1;
        
        
        while(st <= end){
            int m = st + (end - st)/2;
            if(arr[m] == target){
                first = m;
                end = m - 1;
            }else if(arr[m] < target){
                st = m + 1;
            }else{
                end = m - 1;
            }
        }
        return first;
    }
    public int searchLast(int[] arr, int target){
        int st = 0;
        int end = arr.length - 1;
        int last = -1;
        
        
        while(st <= end){
            int m = st + (end - st)/2;
            if(arr[m] == target){
                last = m;
                st = m + 1;
            }else if(arr[m] < target){
                st = m + 1;
            }else{
                end = m - 1;
            }
        }
        return last;
    }

}
