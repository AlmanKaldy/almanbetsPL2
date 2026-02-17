import java.util.HashMap;

class Two_GetAndContainsKey {
    public static void main(String[] args) {
        // Инициализируем map начальными данными
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);
        scores.put("Azat", 92);
        scores.put("Dana", 77);

        // Получаем значение для существующего ключа
        Integer aidaScore = scores.get("Aida");
        System.out.println("Aida: " + (aidaScore != null ? "найдено, score = " + aidaScore : "не найдено"));

        // Получаем значение для отсутствующего ключа
        Integer miraScore = scores.get("Mira");
        System.out.println("Mira (get): " + (miraScore != null ? "найдено, score = " + miraScore : "не найдено"));

        // Проверяем наличие ключа через containsKey
        System.out.println("Mira (containsKey): " + (scores.containsKey("Mira") ? "найдено" : "не найдено"));
    }
}
