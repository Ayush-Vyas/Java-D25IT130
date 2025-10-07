public class MaxOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 1, 0, 1, 1, 1};
        System.out.println("Max consecutive 1s: " + findMaxConsecutiveOnes(nums1)); // Output: 3

        // Test case 2
        int[] nums2 = {1, 0, 1, 1, 0, 1};
        System.out.println("Max consecutive 1s: " + findMaxConsecutiveOnes(nums2)); // Output: 2
    }
}
