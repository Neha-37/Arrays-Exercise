import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Duplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> duplicates = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                if (duplicates.isEmpty() || duplicates.get(duplicates.size() - 1) != nums[i]) {
                    duplicates.add(nums[i]);
                }
            }
        }
        return duplicates;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 1};
        List<Integer> result = findDuplicates(arr);
        System.out.println("Duplicates: " + result);
    }
}