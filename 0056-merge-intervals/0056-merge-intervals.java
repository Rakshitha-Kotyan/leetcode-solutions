class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)-> a[0] - b[0]);

        List<int[]> l = new ArrayList<>();

        int s=intervals[0][0];
        int e=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(e >= intervals[i][0]){
                e = Math.max(e,intervals[i][1]);
            } else {
                l.add(new int[]{s,e});
                s=intervals[i][0];
                e=intervals[i][1];
            }
        }  
        l.add(new int[]{s, e}); 
        return l.toArray(new int[l.size()][]);     
    }
}