package src.assignment_array_list;

import java.util.ArrayList;

public class FindSecondLargest {
    public static void main(String[] args) {
        ArrayList<String> movieTitles = new ArrayList<>();
        movieTitles.add("Up");
        movieTitles.add("Inception");
        movieTitles.add("Toy Story");

        // Шаг 1: Находим самый длинный заголовок
        String firstMax = movieTitles.get(0);
        for (String m : movieTitles) {
            if (m.length() > firstMax.length()) {
                firstMax = m;
            }
        }

        // Шаг 2: Удаляем самый длинный элемент из списка
        movieTitles.remove(firstMax);

        // Шаг 3: Снова ищем самый длинный — теперь он будет вторым по счету
        String secondMax = movieTitles.get(0);
        for (String m : movieTitles) {
            if (m.length() > secondMax.length()) {
                secondMax = m;
            }
        }

        System.out.println("18. Second Longest Movie: " + secondMax);
    }
}