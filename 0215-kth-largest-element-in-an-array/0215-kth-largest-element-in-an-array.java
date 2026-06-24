class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(
            (a,b)-> b -a
        );
       for (int i:nums ){
        pq.offer(i);
       }
        k=k-1;
       while(k-->0){
        pq.poll();
       }
       return pq.peek();
    }
}