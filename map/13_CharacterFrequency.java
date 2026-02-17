import java.util.HashMap;
import java.util.Map;

// Задание 13: Подсчет частоты букв и поиск самой частой буквы.
public class CharacterFrequency13 {
    public static void main(String[] args) {
        String text = "Mississippi";

        // Храним частоты символов.
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        for (char ch : text.toCharArray()) {
            // letters only: учитываем только буквы.
            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                frequencyMap.put(lower, frequencyMap.getOrDefault(lower, 0) + 1);
            }
        }

        // Ищем символ с максимальной частотой.
        char mostFrequent = '\0';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequent = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        System.out.println("13) Character frequencies: " + frequencyMap);
        System.out.println("Most frequent char: '" + mostFrequent + "' -> " + maxCount);
    }
}
