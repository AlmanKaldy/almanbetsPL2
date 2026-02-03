package src.assignment_array_list;

import java.util.ArrayList;

public class ReplaceAllVowels {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Apple");

        // Проходим по списку с помощью индекса
        for (int i = 0; i < words.size(); i++) {
            String w = words.get(i);
            
            // Заменяем гласные буквы по очереди. 
            // Метод чувствителен к регистру, поэтому "A" и "e" заменяются отдельно.
            w = w.replace("A", "*")
                 .replace("e", "*")
                 .replace("i", "*")
                 .replace("o", "*")
                 .replace("u", "*");
            
            // Обновляем элемент в ArrayList измененной строкой
            words.set(i, w);
        }

        System.out.println("14. Vowels replaced: " + words);
    }
}