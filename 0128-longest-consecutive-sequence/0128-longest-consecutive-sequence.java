class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        for(int n : nums){
            s.add(n);
        }
        int max=0;
        int curMax=0;
        for(int cur:s){
          
            if(s.contains(cur-1)){
                continue;
            } else {
                curMax=1;
                cur=cur+1;
                while(s.contains(cur)){
                    curMax++;
                    cur=cur+1;
                }
                max=Math.max(curMax, max);
            }
            
        }
        return max;
    }
}