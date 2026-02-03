package src.assignment_array_list;

import java.util.ArrayList;

public class CountOccurrences {
    public static void main(String[] args) {
        ArrayList<String> foods = new ArrayList<>();
        foods.add("Pizza");
        foods.add("Burger");
        foods.add("Pizza");

        int count = 0;
        // Проходим по списку и считаем вхождения слова "Pizza"
        for (String f : foods) {
            if (f.equals("Pizza")) {
                count++;
            }
        }

        System.out.println("3. Pizza count: " + count);
    }
}