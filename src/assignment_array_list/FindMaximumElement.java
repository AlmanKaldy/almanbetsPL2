package src.assignment_array_list;

import java.util.ArrayList;

public class FindMaximumElement {
    public static void main(String[] args) {
        ArrayList<String> movies = new ArrayList<>();
        movies.add("Inception");
        movies.add("The Dark Knight");
        movies.add("Avatar");
        
        // Начинаем поиск с первого элемента списка
        String longest = movies.get(0);
        
        for (String movie : movies) {
            // Если текущая строка длиннее, чем та, что мы сохранили ранее — обновляем
            if (movie.length() > longest.length()) {
                longest = movie;
            }
        }
        
        System.out.println("2. Longest Movie: " + longest);
    }
}