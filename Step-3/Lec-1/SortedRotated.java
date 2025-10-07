public class SortedRotated {

    public static boolean check(int[] nums) {
        int count = 0;

        // Loop through the array to check where the rotation happened
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                count++;
            }
        }

        // If there is more than one point of rotation, it's not a sorted rotation
        if (count > 1) {
            return false;
        }

        // If there is exactly one rotation point or none, check if the last element is less than the first
        return count == 0 || nums[nums.length - 1] <= nums[0];
    }

    public static void main(String[] args) {
        int[] nums1 = {3, 4, 5, 1, 2};
        int[] nums2 = {2, 1, 3, 4};
        int[] nums3 = {1, 2, 3};

        System.out.println(check(nums1)); // Output: true
        System.out.println(check(nums2)); // Output: false
        System.out.println(check(nums3)); // Output: true
    }
}
