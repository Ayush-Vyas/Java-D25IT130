import java.util.*;

public class RearrangeArray {
    public static int[] rearrangeArray(int[] nums) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> neg = new ArrayList<>();

        // Separate positive and negative numbers
        for (int num : nums) {
            if (num > 0) pos.add(num);
            else neg.add(num);
        }

        int[] result = new int[nums.length];
        int i = 0, p = 0, n = 0;

        // Merge them alternately: +, -, +, -, ...
        while (p < pos.size() && n < neg.size()) {
            result[i++] = pos.get(p++);
            result[i++] = neg.get(n++);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 1, -2, -5, 2, -4};
        System.out.println("Output: " + Arrays.toString(rearrangeArray(nums1)));

        int[] nums2 = {-1, 1};
        System.out.println("Output: " + Arrays.toString(rearrangeArray(nums2)));
    }
}
