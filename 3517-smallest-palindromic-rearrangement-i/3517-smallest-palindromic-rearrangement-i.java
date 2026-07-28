class Solution {
    public String smallestPalindrome(String s) {
        int len=s.length();
        int part=len/2;
        char c[]=s.toCharArray();
        Arrays.sort(c,0,part);
        for(int i=0;i<part;i++){
            c[len-1-i]=c[i];
      }
      return new String(c);
    }
}