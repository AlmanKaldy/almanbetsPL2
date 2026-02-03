package src.assignment_array_list;

import java.util.ArrayList;

public class ReplaceAllElements {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Blue");

        // Проходим по списку через обычный цикл for с индексом
        for (int i = 0; i < colors.size(); i++) {
            // Заменяем текущий элемент на "Black"
            colors.set(i, "Black"); 
        }

        System.out.println("5. Colors: " + colors);
    }
}