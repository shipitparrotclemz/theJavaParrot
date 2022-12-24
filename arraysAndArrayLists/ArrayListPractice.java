import java.util.Arrays;
import java.util.ArrayList;

class ArrayListPractice {
    public static void main(String[] args) {
        // ArrayList<String> arr = new ArrayList<String>();
        // Create an array of String with size 5
        ArrayList<String> arr = new ArrayList<String>(Arrays.asList(new String[5]));

        // Add elements to the ArrayList
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, "Parrot " + i);
        }

        // use a for loop to iterate, by index
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        // Use a while loop to iterate
        int i = 0;
        while (i < arr.size()) {
            System.out.println(arr.get(i));
            i++;
        }
        // String allParrots = arr.toString();

        // Output: ["Parrot 0", "Parrot 1", "Parrot 2", "Parrot 3", "Parrot 4"]
        // System.out.println(allParrots);
    }
}