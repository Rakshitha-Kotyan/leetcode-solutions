import java.util.*;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> a = new ArrayList<>();
        
        for (int num : nums1) {
            a.add(num);
        }
        for (int num : nums2) {
            a.add(num);
        }

        Collections.sort(a);

        int size = a.size();
        if (size % 2 == 1) {
            return a.get(size / 2);
        } else {
            return (a.get(size / 2 - 1) + a.get(size / 2)) / 2.0;
        }
    }
}
