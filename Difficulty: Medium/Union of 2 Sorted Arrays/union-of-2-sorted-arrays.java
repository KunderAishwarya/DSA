// User function Template for Java

// a,b : the arrays
class Solution {
    // Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[]) {
        // add your code here
        int i =0;
        int j =0;
        int m = a.length;
        int n = b.length;
        ArrayList<Integer> list = new ArrayList<>();
        while(i < m && j < n){
            
        while(i < m && i> 0 && a[i] == a[i-1]) i++;
        while(j < n && j> 0 && b[j] == b[j-1]) j++;
        if(i < m && j < n){
            if(a[i] == b[j]){
                list.add(a[i]);
                i++;
                j++;
            } else if(a[i] < b[j]){
                list.add(a[i]);
               
                i++;
            
            }else if(a[i] > b[j]){
                list.add(b[j]);
               
                j++;
            }
        }
        }
        while (i < m){
           if(i == 0 || a[i]!=a[i-1]){
               list.add(a[i]);
               
           }
           i++;
        }
        while (j < n){
           if(j == 0 || b[j]!=b[j-1]){
               list.add(b[j]);
               
           } 
           j++;
        }
        return list;
    }
}
