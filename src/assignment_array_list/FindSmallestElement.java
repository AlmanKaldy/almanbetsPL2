package src.assignment_array_list;

import java.util.ArrayList;

public class FindSmallestElement {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Hello");
        songs.add("Hi");

        // Начинаем сравнение с первого элемента
        String shortest = songs.get(0);

        for (String s : songs) {
            // Если длина текущей строки меньше сохраненной — обновляем shortest
            if (s.length() < shortest.length()) {
                shortest = s;
            }
        }

        System.out.println("13. Shortest song: " + shortest);
    }
}