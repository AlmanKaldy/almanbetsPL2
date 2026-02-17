import java.util.HashMap;

// Задание 20: Объединение двух таблиц оценок через merge().
public class MergeScores20 {
    public static void main(String[] args) {
        HashMap<String, Integer> scores1 = new HashMap<>();
        scores1.put("Aida", 40);
        scores1.put("Azat", 35);
        scores1.put("Dana", 50);

        HashMap<String, Integer> scores2 = new HashMap<>();
        scores2.put("Azat", 10);
        scores2.put("Dana", 5);
        scores2.put("Mira", 45);

        // Создаем итоговую карту на базе первой.
        HashMap<String, Integer> merged = new HashMap<>(scores1);

        // merge(): если ключ есть - суммируем, если нет - добавляем новое значение.
        for (String key : scores2.keySet()) {
            merged.merge(key, scores2.get(key), Integer::sum);
        }

        System.out.println("20) Merged scores: " + merged);
    }
}
