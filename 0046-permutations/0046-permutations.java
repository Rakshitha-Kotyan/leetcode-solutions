import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();
        backtrack(res, temp, nums);
        return res;
    }

    private void backtrack(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i : nums) {
            if (temp.contains(i)) continue;

            temp.add(i);
            backtrack(res, temp, nums);
            temp.remove(temp.size() - 1);
        }
    }
}
