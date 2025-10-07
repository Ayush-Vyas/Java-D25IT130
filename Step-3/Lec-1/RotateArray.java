public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        // Normalize k in case it's greater than the length
        k = k % n;

        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the rest
        reverse(nums, k, n - 1);
    }

    // Helper function to reverse a portion of the array
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        int k1 = 3;
        rotate(nums1, k1);
        System.out.print("Rotated array 1: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test case 2
        int[] nums2 = {-1, -100, 3, 99};
        int k2 = 2;
        rotate(nums2, k2);
        System.out.print("Rotated array 2: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}
