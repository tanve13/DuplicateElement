import java.util.*;

public class ContainsDuplicateII {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                if (i - prevIndex <= k) {
                    return true; // Found nearby duplicate
                }
            }
            map.put(nums[i], i); // Update index
        }
        return false;
    }

    // Test the function
    public static void main(String[] args) {
        ContainsDuplicateII sol = new ContainsDuplicateII();
        
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 0, 1, 1};
        int[] nums3 = {1, 2, 3, 1, 2, 3};

        System.out.println(sol.containsNearbyDuplicate(nums1, 3)); // true
        System.out.println(sol.containsNearbyDuplicate(nums2, 1)); // true
        System.out.println(sol.containsNearbyDuplicate(nums3, 2)); // false
    }
}
