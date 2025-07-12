

// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int largest = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;
        
        for(int num : arr){
            if(num > largest){
                second_large = largest;
                largest = num ;
                
            }else if(num > second_large && num != largest){
                second_large = num;
            }
        }
        
        if(second_large!=Integer.MIN_VALUE){
            return second_large;
        }else{
            return -1;
        }
        
    }
}