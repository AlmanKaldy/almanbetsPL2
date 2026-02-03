package src.assignment_array_list;

import java.util.ArrayList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Cat");

        ArrayList<String> uniqueAnimals = new ArrayList<>();
        
        // Проходим по списку animals
        for (String a : animals) {
            // Если в новом списке еще нет такого животного — добавляем
            if (!uniqueAnimals.contains(a)) {
                uniqueAnimals.add(a);
            }
        }

        System.out.println("8. Unique Animals: " + uniqueAnimals);
    }
}