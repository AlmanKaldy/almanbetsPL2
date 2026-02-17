import java.util.HashMap;

// Задание 18: Сравнение двух HashMap с одинаковыми данными в разном порядке.
public class EqualsAndOrderInsensitive18 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        // Добавляем одни и те же пары в разном порядке.
        map1.put("apple", 3);
        map1.put("banana", 2);
        map1.put("kiwi", 1);

        map2.put("kiwi", 1);
        map2.put("apple", 3);
        map2.put("banana", 2);

        // equals() сравнивает содержимое (ключи и значения), а не порядок добавления.
        System.out.println("18) map1: " + map1);
        System.out.println("map2: " + map2);
        System.out.println("map1.equals(map2): " + map1.equals(map2));

        // hashCode() для одинакового содержимого будет одинаковым.
        System.out.println("map1.hashCode(): " + map1.hashCode());
        System.out.println("map2.hashCode(): " + map2.hashCode());
    }
}
