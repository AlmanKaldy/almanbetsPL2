import java.util.HashMap;

class Six_GetOrDefault {
    public static void main(String[] args) {
        // Создаем map с данными
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);
        scores.put("Azat", 92);
        scores.put("Dana", 77);

        // Проверяем несколько имен через getOrDefault
        printLookup(scores, "Mira");
        printLookup(scores, "Aida");
        printLookup(scores, "Dana");
    }

    private static void printLookup(HashMap<String, Integer> scores, String name) {
        // Если ключ не найден, вернется -1
        int value = scores.getOrDefault(name, -1);
        if (value == -1) {
            System.out.println(name + ": Not found");
        } else {
            System.out.println(name + ": score = " + value);
        }
    }
}
