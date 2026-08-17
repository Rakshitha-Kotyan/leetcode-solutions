class Solution {
    public String removeOuterParentheses(String s) {
        String ans="";
        int open=0;
        int close=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                open++;
            } else {
                close++;
            }
            if(close==open){
                ans+=s.substring(start+1,i);
                start=i+1;
                close=0;
                open=0;
            }
        }
        return ans;
        
    }
}