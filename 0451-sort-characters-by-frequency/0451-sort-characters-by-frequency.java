class Solution {
    public String frequencySort(String s) {
        char ch[] = s.toCharArray();
        
        Map<Character,Integer> m = new HashMap<>();
        for(char c:ch){
            m.put(c,m.getOrDefault(c,0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>(
            (a,b)-> b.getValue() - a.getValue()
            );
    pq.addAll(m.entrySet());
    StringBuilder sb = new StringBuilder();
    while(!pq.isEmpty()){
        Map.Entry<Character,Integer> e = pq.poll();
        for(int i=0;i<e.getValue();i++){
            sb.append(e.getKey());
        }

    }

    return sb.toString();

    }
}