package src.assignment_array_list;

import java.util.ArrayList;

public class FindIndexOfElement {
    public static void main(String[] args) {
        ArrayList<String> flowers = new ArrayList<>();
        flowers.add("Rose");  // Index 0
        flowers.add("Lily");  // Index 1
        flowers.add("Rose");  // Index 2
        
        // indexOf находит первое вхождение (0)
        // lastIndexOf находит последнее вхождение (2)
        System.out.println("7. First Rose: " + flowers.indexOf("Rose") + ", Last Rose: " + flowers.lastIndexOf("Rose"));
    }
}