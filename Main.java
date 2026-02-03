import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // --- 1. Merge Unique Elements ---
        ArrayList<String> books1 = new ArrayList<>();
        books1.add("Java Basics");
        books1.add("Python Pro");

        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Java Basics");
        books2.add("C++ Intro");

        for (String book : books2) {
            if (!books1.contains(book)) { // Check if element exists
                books1.add(book);
            }
        }

        System.out.println("1. Merged Books: " + books1);
    }
}
