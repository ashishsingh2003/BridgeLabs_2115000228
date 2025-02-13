import java.util.*;

public class FindZeroSumSubarrays {
    public static List<int[]> findSubarrays(int[] nums) {
        List<int[]> result = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        int sum = 0;
        map.put(0, new ArrayList<>(Arrays.asList(-1)));
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum)) {
                for (int start : map.get(sum)) {
                    result.add(Arrays.copyOfRange(nums, start + 1, i + 1));
                }
            }
            map.putIfAbsent(sum, new ArrayList<>());
            map.get(sum).add(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, -3, 1, 6};
        List<int[]> subarrays = findSubarrays(nums);
        for (int[] subarray : subarrays) {
            System.out.println(Arrays.toString(subarray));
        }
    }
}

