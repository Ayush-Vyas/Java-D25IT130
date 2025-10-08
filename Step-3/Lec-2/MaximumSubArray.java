public class MaximumSubArray {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            // Either extend the current subarray or start a new one
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Output: " + maxSubArray(nums1)); // 6

        int[] nums2 = {1};
        System.out.println("Output: " + maxSubArray(nums2)); // 1

        int[] nums3 = {5, 4, -1, 7, 8};
        System.out.println("Output: " + maxSubArray(nums3)); // 23
    }
}
