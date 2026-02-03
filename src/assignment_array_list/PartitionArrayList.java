package src.assignment_array_list;

import java.util.ArrayList;

public class PartitionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> allNumbers = new ArrayList<>();
        allNumbers.add(10);
        allNumbers.add(7);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        // Проходим по исходному списку
        for (Integer n : allNumbers) {
            // Если число делится на 2 без остатка — оно четное
            if (n % 2 == 0) {
                even.add(n);
            } else {
                // В противном случае — нечетное
                odd.add(n);
            }
        }

        System.out.println("15. Even: " + even + " Odd: " + odd);
    }
}