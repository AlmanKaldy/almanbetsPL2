import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Задание 17: Поиск уникальных и дублирующихся элементов.
public class DetectDuplicatesWithMap17 {
    public static void main(String[] args) {
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "kiwi");

        HashMap<String, Integer> frequencyMap = new HashMap<>();
        for (String item : items) {
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        System.out.println("17) Frequencies: " + frequencyMap);
        System.out.println("Unique items (freq = 1):");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println("- " + entry.getKey());
            }
        }

        System.out.println("Duplicate items (freq > 1):");
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("- " + entry.getKey() + " -> " + entry.getValue());
            }
        }
    }
}
