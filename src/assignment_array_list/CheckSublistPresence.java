package src.assignment_array_list;

import java.util.ArrayList;

public class CheckSublistPresence {
    public static void main(String[] args) {
        ArrayList<String> sports = new ArrayList<>();
        sports.add("Football");
        sports.add("Tennis");
        sports.add("Basketball");

        // Проверяем наличие обоих элементов в списке одновременно
        boolean hasSublist = sports.contains("Football") && sports.contains("Tennis");

        System.out.println("6. Contains Football and Tennis: " + hasSublist);
    }
}