package src.assignment_array_list;

import java.util.ArrayList;

public class RemoveAllMatchingElements {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Banana");

        // Используем цикл while для удаления всех вхождений "Banana"
        // contains проверяет наличие, remove удаляет первое найденное совпадение
        while (fruits.contains("Banana")) {
            fruits.remove("Banana");
        }

        System.out.println("4. Fruits after removal: " + fruits);
    }
}