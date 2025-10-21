import java.util.*;

public class ContainsDuplicateSorted {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicateSorted sol = new ContainsDuplicateSorted();
        int[] nums = {1, 2, 3, 1};
        System.out.println(sol.containsDuplicate(nums)); // true
    }
}
