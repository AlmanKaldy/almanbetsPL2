package src;

import java.util.ArrayList;

public class FindCommonElements {
    public static void main(String[] args) {
        ArrayList<String> countries1 = new ArrayList<>();
        countries1.add("USA");
        countries1.add("Germany");

        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("Germany");
        countries2.add("France");

        ArrayList<String> common = new ArrayList<>();

        // Проходим по первому списку
        for (String c : countries1) {
            // Если элемент из первого списка есть и во втором — сохраняем его
            if (countries2.contains(c)) {
                common.add(c);
            }
        }

        System.out.println("11. Common: " + common);
    }
}