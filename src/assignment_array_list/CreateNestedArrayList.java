package src.assignment_array_list;

import java.util.ArrayList;

public class CreateNestedArrayList {
    public static void main(String[] args) {
        // Создаем "внешний" список, который будет хранить другие списки строк
        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        // Создаем "внутренний" список для отдела продаж
        ArrayList<String> sales = new ArrayList<>();
        sales.add("John");
        sales.add("Emma");

        // Добавляем внутренний список во внешний
        departments.add(sales);

        System.out.println("20. Departments: " + departments);
    }
}