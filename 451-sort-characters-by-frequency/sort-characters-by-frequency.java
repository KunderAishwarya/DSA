class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> freqMap = new HashMap<>();
        for(char c : s.toCharArray()){
            freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
        }

        List<Character> list = new ArrayList<>(freqMap.keySet());
        list.sort((a,b) -> freqMap.get(b) - freqMap.get(a));

        StringBuilder sb = new StringBuilder();
        for(char c : list){
            sb.append(String.valueOf(c).repeat(freqMap.get(c)));
        }
        return sb.toString();
    }
}