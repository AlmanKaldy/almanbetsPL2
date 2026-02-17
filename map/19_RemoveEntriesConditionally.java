import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// Задание 19: Удаление записей по условию.
public class RemoveEntriesConditionally19 {
    public static void main(String[] args) {
        HashMap<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Aida", 85);
        studentScores.put("Azat", 55);
        studentScores.put("Dana", 60);
        studentScores.put("Mira", 48);

        System.out.println("19) Before removal: " + studentScores);

        // Используем Iterator и iterator.remove(), чтобы безопасно удалять во время обхода.
        Iterator<Map.Entry<String, Integer>> iterator = studentScores.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 60) {
                iterator.remove();
            }
        }

        // Нельзя удалять в foreach, потому что это приведет к ConcurrentModificationException.
        System.out.println("After removal (score >= 60): " + studentScores);
    }
}
