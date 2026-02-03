package src.assignment_array_list;

import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");

        // Создаем массив фиксированной длины, равной размеру ArrayList
        String[] cityArray = new String[cities.size()];

        // Копируем элементы по индексам
        for (int i = 0; i < cities.size(); i++) {
            cityArray[i] = cities.get(i);
        }

        // Вывод элементов массива
        System.out.print("9. Array: ");
        for (String c : cityArray) {
            System.out.print(c + " ");
        }
        System.out.println(); // Для переноса строки в конце
    }
}