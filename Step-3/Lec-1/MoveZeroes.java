public class MoveZeroes {

    public static void moveZeroes(int[] nums) {
        int insertPos = 0;

        // Move non-zero elements forward
        for (int num : nums) {
            if (num != 0) {
                nums[insertPos++] = num;
            }
        }

        // Fill the rest of the array with 0s
        while (insertPos < nums.length) {
            nums[insertPos++] = 0;
        }
    }

    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {0, 1, 0, 3, 12};
        moveZeroes(nums1);
        System.out.print("Output 1: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Test case 2
        int[] nums2 = {0};
        moveZeroes(nums2);
        System.out.print("Output 2: ");
        for (int num : nums2) {
            System.out.print(num + " ");
        }
    }
}
