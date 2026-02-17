import java.util.HashMap;

class Eight_Replace {
    public static void main(String[] args) {
        // Создаем map
        HashMap<String, Integer> scores = new HashMap<>();
        scores.put("Aida", 85);
        scores.put("Azat", 92);

        // replace(key, oldValue, newValue): вернет true, если замена успешна
        boolean firstReplace = scores.replace("Aida", 85, 86);
        System.out.println("replace(Aida, 85, 86): " + firstReplace + ", map = " + scores);

        // replace(key, value): вернет старое значение или null
        Integer oldValue = scores.replace("Aida", 91);
        System.out.println("replace(Aida, 91): старое значение = " + oldValue + ", map = " + scores);

        // Пробуем заменить отсутствующий ключ
        Integer missingReplace = scores.replace("NonExisting", 100);
        System.out.println("replace(NonExisting, 100): " + (missingReplace == null ? "ключ отсутствует" : "заменено"));
    }
}
