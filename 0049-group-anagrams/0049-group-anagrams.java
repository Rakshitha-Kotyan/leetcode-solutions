class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> m = new HashMap<>();
        int freq[]=new int[26];
        for(String s:strs){
            Arrays.fill(freq,0);
            for(int i=0;i<s.length();i++){
                freq[s.charAt(i)-'a']++;
            }
            String code=Arrays.toString(freq);
            m.putIfAbsent(code, new ArrayList<>());
            m.get(code).add(s);           
        }
        return new ArrayList<>(m.values());
    }
}