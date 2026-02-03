package src.assignment_array_list;

import java.util.ArrayList;

public class RotateElements {
    public static void main(String[] args) {
        ArrayList<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Tue");
        days.add("Wed");

        // Ротация на 2 позиции: дважды перемещаем последний элемент в начало
        for (int i = 0; i < 2; i++) {
            // Метод remove() возвращает удаленный элемент
            String last = days.remove(days.size() - 1);
            // Добавляем этот элемент в начало списка
            days.add(0, last);
        }

        System.out.println("16. Rotated: " + days);
    }
}