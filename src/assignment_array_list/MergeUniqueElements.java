package src.assignment_array_list;

import java.util.ArrayList;

public class MergeUniqueElements {
    public static void main(String[] args) {
        // Инициализация первого списка
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("Java Basics");
        books1.add("Python Pro");

        // Инициализация второго списка
        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Java Basics");
        books2.add("C++ Intro");
        
        // Логика объединения: добавляем только те книги, которых еще нет в books1
        for (String book : books2) {
            if (!books1.contains(book)) { 
                books1.add(book);
            }
        }

        // Вывод результата
        System.out.println("1. Merged Books: " + books1);
    }
}