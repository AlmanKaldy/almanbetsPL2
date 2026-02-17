import java.util.HashMap;

class Five_IsEmptyAndClear {
    public static void main(String[] args) {
        // Создаем map с начальными элементами
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);
        scores.put("Azat", 92);

        // Проверяем, пустая ли map до clear
        System.out.println("isEmpty() до clear: " + scores.isEmpty());

        // Очищаем все элементы
        scores.clear();

        // Проверяем, пустая ли map после clear
        System.out.println("isEmpty() после clear: " + scores.isEmpty());

        // Снова добавляем 2 элемента
        scores.put("Dana", 77);
        scores.put("Mira", 88);
        System.out.println("Map после повторного добавления: " + scores);
    }
}
