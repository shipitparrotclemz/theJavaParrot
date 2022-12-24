import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class SortingArrayListParrots {
    public static void main(String[] args) {
        // 10 parrots!
        String[] parrotNames = {"Polly", "Sam", "bob", "Charlie", "Lucy", "Max", "Pepper", "Luna", "Rocky", "Goldie"};

        // Convert the String[] to an ArrayList! We will be using this instead.
        ArrayList<String> parrotListNames = new ArrayList<String>(Arrays.asList(parrotNames));

        // sort them ascendingly in place! Use Collections.sort(). Sorted lexographically
        // lexographically is a fancy word for saying small letter words in front, followed by large letters at the back, in alphabetical order.
        // Uses Timsort, an efficient merge + insertion sort variant. Time Complexity of O(NLogN)
        Collections.sort(parrotListNames);

        // [Charlie, Goldie, Lucy, Luna, Max, Pepper, Polly, Rocky, Sam, bob]
        System.out.println(parrotListNames.toString());

        // sort them descendingly
        Collections.sort(parrotListNames, Collections.reverseOrder());

        // [bob, Sam, Rocky, Polly, Pepper, Max, Luna, Lucy, Goldie, Charlie]
        System.out.println(parrotListNames.toString());
    }
}