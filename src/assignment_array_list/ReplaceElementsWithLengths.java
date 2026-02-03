package src.assignment_array_list;

import java.util.ArrayList;

public class ReplaceElementsWithLengths {
    public static void main(String[] args) {
        ArrayList<String> fruitNames = new ArrayList<>();
        fruitNames.add("Kiwi");

        ArrayList<String> lengths = new ArrayList<>();
        
        // Проходим по каждому фрукту в списке
        for (String f : fruitNames) {
            // Получаем длину строки и преобразуем её в String
            lengths.add(String.valueOf(f.length()));
        }

        System.out.println("19. Fruit Lengths: " + lengths);
    }
}