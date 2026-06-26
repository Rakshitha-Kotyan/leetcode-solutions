class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s = new HashSet<>();
        if(nums.length==0){
            return 0;
        }
        int longestLength=1;
        for ( int i : nums ) {
             s.add(i);
        }
        for(int n : s){
            if(s.contains(n-1)){
                continue;
            }
            else {
                int cur=n;
                int curL=1;
                while(s.contains(cur+1)){
                    cur++;
                    curL++;
                }
                 longestLength= Math.max ( curL ,longestLength);
            }
           
        }
        return longestLength;

    }
}