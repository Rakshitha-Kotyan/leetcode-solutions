class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for(int i:nums){
            s.add(i);
        }
        int i=1;
        while(true){
            int ans=k*i;
            if(!s.contains(ans)){
                return ans;
            }
            i++;
        }
    }
}