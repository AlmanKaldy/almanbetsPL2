import java.util.HashMap;

// Задание 16: Two Sum через HashMap (значение -> индекс).
public class TwoSumWithMap16 {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        HashMap<Integer, Integer> indexMap = new HashMap<>();
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (indexMap.containsKey(complement)) {
                firstIndex = indexMap.get(complement);
                secondIndex = i;
                break;
            }

            indexMap.put(nums[i], i);
        }

        System.out.println("16) Value->Index map state: " + indexMap);
        if (firstIndex != -1) {
            System.out.println("Found indices: [" + firstIndex + ", " + secondIndex + "]");
        } else {
            System.out.println("No pair found.");
        }
    }
}
