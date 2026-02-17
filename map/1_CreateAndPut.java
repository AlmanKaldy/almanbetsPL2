import java.util.HashMap;

// Примечание: имя класса сделано валидным для Java (идентификатор не может начинаться с цифры).
class One_CreateAndPut {
    public static void main(String[] args) {
        // Создаем HashMap для хранения пары: имя -> балл
        HashMap<String, Integer> scores = new HashMap<>();

        // Добавляем элементы в map
        scores.put("Aida", 85);
        scores.put("Azat", 92);
        scores.put("Dana", 77);

        // Выводим содержимое и размер map
        System.out.println("Map: " + scores);
        System.out.println("Size: " + scores.size());
    }
}
