class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder("");
        int open=0;
        int start=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                open++;
            } else {
                open--;
            }
            if(open==0){
                ans.append(s.substring(start+1,i));
                start=i+1;
            }
        }
        return ans.toString();
        
    }
}