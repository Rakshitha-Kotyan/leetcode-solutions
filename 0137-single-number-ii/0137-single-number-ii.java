class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i:nums){
            m.put(i,m.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e : m.entrySet()){
           if(e.getValue()==1){
            return e.getKey();
           } 
        }
        return 0;
    }
}