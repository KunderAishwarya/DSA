// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n = arr.length;
        long sum = 0;
        long sumSq = 0;
        for(int values : arr){
             sum += (long)values;
             sumSq += (long)values * values;
        }
        
        long exSum = (long) n * (n+1)/2;
        long exSumSq = (long) n * (n + 1) * (2 * n + 1)/6;
        
        long diff = sum - exSum; //(x - y)
        long diffSq = sumSq - exSumSq;
        
        long div = diffSq/diff; //(x + y)
        
        long x = (div + diff)/2;
        long y = div - x;
        ArrayList<Integer> list = new ArrayList<>();
        list.add((int)x);
        list.add((int)y);
        return list;
    }
}
