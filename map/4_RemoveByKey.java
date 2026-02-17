import java.util.HashMap;

class Four_RemoveByKey {
    public static void main(String[] args) {
        // Создаем map с начальными данными
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);
        scores.put("Azat", 92);
        scores.put("Dana", 77);

        // Удаляем существующий ключ
        Integer removedAzat = scores.remove("Azat");
        System.out.println("Удаление Azat: " + (removedAzat != null ? "удалено, значение = " + removedAzat : "ключ не найден"));

        // Пытаемся удалить отсутствующий ключ
        Integer removedNonExisting = scores.remove("NonExisting");
        System.out.println("Удаление NonExisting: " + (removedNonExisting != null ? "удалено" : "ключ не найден"));

        // Итоговое состояние map
        System.out.println("Текущая map: " + scores);
    }
}
