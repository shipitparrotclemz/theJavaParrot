import java.util.Arrays;
import java.util.Collections;

class SortingArrayParrots {
    public static void main(String[] args) {
        // 10 parrots!
        String[] parrotNames = {"Polly", "Sam", "bob", "Charlie", "Lucy", "Max", "Pepper", "Luna", "Rocky", "Goldie"};

        // sort them ascendingly in place! Use Arrays.sort(). Sorted lexographically
        // lexographically is a fancy word for saying small letter words in front, followed by large letters at the back, in alphabetical order.
        // Uses Timsort, an efficient merge + insertion sort variant. Time Complexity of O(NLogN)
        Arrays.sort(parrotNames);

        // [Charlie, Goldie, Lucy, Luna, Max, Pepper, Polly, Rocky, Sam, bob]
        System.out.println(Arrays.toString(parrotNames));

        // sort them descendingly
        Arrays.sort(parrotNames, Collections.reverseOrder());

        // [bob, Sam, Rocky, Polly, Pepper, Max, Luna, Lucy, Goldie, Charlie]
        System.out.println(Arrays.toString(parrotNames));
    }
}