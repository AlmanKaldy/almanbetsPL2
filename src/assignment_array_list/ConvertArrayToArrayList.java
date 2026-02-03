package src.assignment_array_list;

import java.util.ArrayList;

public class ConvertArrayToArrayList {
    public static void main(String[] args) {
        // Используем массив объектов Integer, так как ArrayList не работает с примитивами
        Integer[] nums = {1, 2, 3}; 
        
        ArrayList<Integer> numList = new ArrayList<>();

        // Перебираем массив и добавляем каждый элемент в ArrayList
        for (int n : nums) {
            numList.add(n);
        }

        System.out.println("10. ArrayList from Array: " + numList);
    }
}