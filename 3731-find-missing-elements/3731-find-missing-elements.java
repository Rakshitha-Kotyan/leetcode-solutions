class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int n =nums[nums.length-1];
        List<Integer> l = new ArrayList<>();
        int i=0;
        while(true){
            if(a==n) {
            break;
            }
            if(nums[i]!=a){
                l.add(a);
            } else {
                i++;
            }
            a++;
        }
        
        return l;
    }
}