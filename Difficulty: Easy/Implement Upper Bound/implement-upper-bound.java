class Solution {
    int upperBound(int[] arr, int target) {
        // code here
        int n = arr.length;
        int op = upperArr(arr, n , target);
        return op;
    }
    public static int upperArr(int[] arr, int n, int target){
        int st =0;
        int end = n-1;
        int ans = n;
        
        while(st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] > target){
                ans = mid;
                end = mid-1;
            }else{
                
                st = mid +1;
            }
        }
        return ans;
    }
}
