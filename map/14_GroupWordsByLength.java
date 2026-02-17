import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

// Задание 14: Группировка слов по длине.
public class GroupWordsByLength14 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hi", "book", "java", "sun", "loop", "map"));

        // Ключ - длина слова, значение - список слов этой длины.
        HashMap<Integer, ArrayList<String>> grouped = new HashMap<>();

        for (String word : words) {
            // computeIfAbsent создает список только при отсутствии ключа.
            grouped.computeIfAbsent(word.length(), k -> new ArrayList<>()).add(word);
        }

        System.out.println("14) Grouped words by length: " + grouped);
    }
}
