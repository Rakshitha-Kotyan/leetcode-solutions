class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<1){
            return "";
        }
        int left=0;
        int right=0;
        for(int i=0;i<s.length();i++){
            int oddl=lenPalindrome(s,i,i);
            int evenl=lenPalindrome(s,i,i+1);
            int len=Math.max(oddl,evenl);
            if(len>right-left){
                left=i-(len-1)/2;
                right=i+len/2;
            }

        }
      
        return s.substring(left,right+1);
        
    }
    public static int lenPalindrome(String str, int i, int j){
        int l=i;
        int R=j;

        while(l>=0 && R<str.length() && str.charAt(l)==str.charAt(R)){
            l--;
            R++;
        }
       // System.out.println(R-l-1);
        return R-l-1;
    }
}