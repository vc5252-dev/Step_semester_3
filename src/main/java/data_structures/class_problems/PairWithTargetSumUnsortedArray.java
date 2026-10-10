package data_structures.class_problems;
import java.util.HashSet;
import java.util.Set;
public class PairWithTargetSumUnsortedArray {
    // Kept separate because the practice sheet lists this as Problem 4 as well.
    public static boolean hasPairWithSum(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        for (int value : nums) {
            if (seen.contains(target - value)) return true;
            seen.add(value);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasPairWithSum(new int[]{2, 7, 11, 15}, 9));
        System.out.println(hasPairWithSum(new int[]{3, 4, 6}, 20));
    }
}
