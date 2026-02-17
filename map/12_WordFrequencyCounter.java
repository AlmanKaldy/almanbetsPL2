import java.util.HashMap;
import java.util.Map;

// Задание 12: Подсчет частоты слов в строке.
public class WordFrequencyCounter12 {
    public static void main(String[] args) {
        String text = "Java is fun and Java is powerful and fun";

        // Приводим строку к нижнему регистру и разбиваем по пробелам.
        String[] words = text.toLowerCase().split(" ");

        // HashMap хранит слово и количество его повторений.
        HashMap<String, Integer> frequencyMap = new HashMap<>();

        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        // Выводим итоговую карту частот.
        System.out.println("12) Word frequencies: " + frequencyMap);

        // Дополнительный детальный вывод.
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
