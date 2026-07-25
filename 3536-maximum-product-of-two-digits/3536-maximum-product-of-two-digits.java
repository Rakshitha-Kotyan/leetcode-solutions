class Solution {
    public int maxProduct(int n) {
        if(n<10)  return n;
        ArrayList<Integer> a = new ArrayList<>();
        while(n!=0){
            a.add(n%10);
            n/=10;
        }
        Collections.sort(a);
        int s=a.size();
        return a.get(s-1)*a.get(s-2);
    }
}