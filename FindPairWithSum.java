import java.util.*;

public class FindPairWithSum {
    public static boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(target - num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, -3, 1, 6};
        int target = 3;
        System.out.println(hasPairWithSum(nums, target));
    }
}

