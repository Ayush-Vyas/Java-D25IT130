import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        // Create a HashMap to store numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();

        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            // If complement is found in map, return the indices
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            // Store the number and its index in the map
            map.put(nums[i], i);
        }

        // If no solution found (shouldn’t happen per problem statement)
        throw new IllegalArgumentException("No two sum solution");
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = twoSum(nums1, target1);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = twoSum(nums2, target2);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = twoSum(nums3, target3);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]");
    }
}
