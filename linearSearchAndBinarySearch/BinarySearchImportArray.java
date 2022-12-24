import java.util.Arrays;
import java.util.Collections;

class BinarySearchImportArray {
    public static void main(String[] args) {
        // 10 parrots!
        String[] parrotNames = {"Polly", "Sam", "bob", "Charlie", "Lucy", "Max", "Pepper", "Luna", "Rocky", "Goldie"};

        // sort them ascendingly in place! Use Arrays.sort(). Sorted lexographically
        // lexographically is a fancy word for saying small letter words in front, followed by large letters at the back, in alphabetical order.
        // Uses Timsort, an efficient merge + insertion sort variant. Time Complexity of O(NLogN)
        Arrays.sort(parrotNames);

        // [Charlie, Goldie, Lucy, Luna, Max, Pepper, Polly, Rocky, Sam, bob]
        System.out.println(Arrays.toString(parrotNames));

        // Lets find "Lucy" in the sorted Array. expected index is 2
        int lucyIndex = Arrays.binarySearch(parrotNames, "Lucy");
        System.out.println("lucyIndex: " + lucyIndex);

        // Lets find "bob" in the sorted Array. expected index is 9
        int bobIndex = Arrays.binarySearch(parrotNames, "bob");
        System.out.println("bobIndex: " + bobIndex);

        // Lets find "Polly" in the sorted Array. expected index is 6
        int pollyIndex = Arrays.binarySearch(parrotNames, "Polly");
        System.out.println("pollyIndex: " + pollyIndex);
    }
}