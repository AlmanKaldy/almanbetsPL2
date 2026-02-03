package src.assignment_array_list;

import java.util.ArrayList;

public class RemoveNullValues {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Alice");
        students.add(null);
        students.add("Bob");
        students.add(null);

        // Цикл продолжается, пока в списке есть хотя бы один null
        while (students.contains(null)) {
            // Удаляем первое найденное вхождение null
            students.remove(null);
        }

        System.out.println("17. Students: " + students);
    }
}