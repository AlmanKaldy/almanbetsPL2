package src.assignment_array_list;

import java.util.ArrayList;

public class RemoveEvenLengthStrings {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Bob");   // Длина 3 (нечетная)
        names.add("Anna");  // Длина 4 (четная)

        ArrayList<String> filteredNames = new ArrayList<>();

        // Проходим по списку и проверяем длину каждой строки
        for (String name : names) {
            // Если длина нечетная (остаток от деления на 2 не равен 0)
            if (name.length() % 2 != 0) {
                filteredNames.add(name);
            }
        }

        System.out.println("12. Odd-length names: " + filteredNames);
    }
}