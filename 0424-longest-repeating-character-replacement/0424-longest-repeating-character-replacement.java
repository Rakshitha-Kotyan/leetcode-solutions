class Solution {
    public int characterReplacement(String s, int k) {
        int maxlen=0;
        Map<Character, Integer> m = new HashMap<>();
        int maxf=0;
        int left=0;
        for(int right=0;right<s.length();right++){
            m.put(s.charAt(right),m.getOrDefault(s.charAt(right),0)+1);
            maxf=Math.max(maxf,m.get(s.charAt(right)));

            while((right-left+1)-maxf >k){
                m.put(s.charAt(left),m.get(s.charAt(left))-1);
                left++;
            }
            maxlen=Math.max(maxlen, right-left+1);
        }

        return maxlen;
    }
}