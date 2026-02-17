import java.util.HashMap;

class Seven_PutIfAbsent {
    public static void main(String[] args) {
        // Инициализация map
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);
        scores.put("Azat", 92);

        // Для существующего ключа значение не изменится
        Integer previousAida = scores.putIfAbsent("Aida", 90);
        System.out.println("putIfAbsent(Aida, 90): предыдущее значение = " + previousAida + " (значение не перезаписано)");

        // Для отсутствующего ключа пара будет добавлена
        Integer previousMira = scores.putIfAbsent("Mira", 88);
        System.out.println("putIfAbsent(Mira, 88): предыдущее значение = " + previousMira + " (ключ добавлен)");

        // Итоговое состояние map
        System.out.println("Map: " + scores);
    }
}
