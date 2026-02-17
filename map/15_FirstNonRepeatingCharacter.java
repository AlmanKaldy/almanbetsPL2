import java.util.HashMap;

// Задание 15: Первый неповторяющийся символ.
public class FirstNonRepeatingCharacter15 {
    public static void main(String[] args) {
        String text = "swiss";
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Шаг 1: считаем частоты.
        for (char ch : text.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Шаг 2: находим первый символ с частотой 1.
        Character firstNonRepeating = null;
        for (char ch : text.toCharArray()) {
            if (frequencyMap.get(ch) == 1) {
                firstNonRepeating = ch;
                break;
            }
        }

        System.out.println("15) Frequencies: " + frequencyMap);
        System.out.println("First non-repeating character: " + firstNonRepeating);
    }
}
