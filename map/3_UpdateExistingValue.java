import java.util.HashMap;

class Three_UpdateExistingValue {
    public static void main(String[] args) {
        // Создаем map и добавляем элементы
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);
        scores.put("Azat", 92);
        scores.put("Dana", 77);

        // Обновляем существующее значение Dana: 77 -> 80
        Integer oldValue = scores.put("Dana", 80);

        // put возвращает старое значение для ключа
        System.out.println("Старое значение Dana: " + oldValue);
        System.out.println("Новая map: " + scores);
    }
}
