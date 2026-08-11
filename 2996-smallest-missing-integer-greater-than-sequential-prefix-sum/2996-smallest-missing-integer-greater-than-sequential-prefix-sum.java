class Solution {
    public int missingInteger(int[] nums) {
        int n=nums.length;
        Set<Integer> s = new HashSet<>();
        for(int ni:nums){
            s.add(ni);
        }
        int pre=0;
        int j=0;
        while(j!=n){
            if(j==0 || nums[j] == nums[j - 1] + 1 ){
                pre+=nums[j];
                j++;
            } else {
                break;
            }
        }

        while(s.contains(pre)){
            pre+=1;
        }
        return pre;
    }
}