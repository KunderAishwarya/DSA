class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1 =0;
        int count2 = 0;
        int cand1 = 0;
        int cand2 = 0;
        int n = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int num : nums){
            if(num == cand1){
                count1++;
            }else if (num == cand2){
                count2++;
            }else if (count1 == 0){
                cand1 = num;
                count1 = 1;
            }else if (count2 == 0){
                cand2 = num;
                count2 = 1;
            }else{
                count1--;
                count2--;
            }                        
        }

        count1 = 0;
            count2 = 0;
            for(int arr : nums){
                if(arr == cand1){
                    count1++;
                }else if(arr == cand2){
                    count2++;
                }
                
            }
            if(count1 > n/3){
                list.add(cand1);
            }
            if(count2 > n/3){
                list.add(cand2);
            }
            return list;
    }
}