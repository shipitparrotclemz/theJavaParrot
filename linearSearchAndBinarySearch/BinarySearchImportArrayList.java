import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

class BinarySearchImportArrayList {
    public static void main(String[] args) {
        // 10 parrots!
        String[] parrotNames = {"Polly", "Sam", "bob", "Charlie", "Lucy", "Max", "Pepper", "Luna", "Rocky", "Goldie"};

        // convert the String[] to an ArrayList!
        ArrayList<String> parrotNamesList = new ArrayList<String>(Arrays.asList(parrotNames));

        // sort them ascendingly in place! Use Arrays.sort(). Sorted lexographically
        // lexographically is a fancy word for saying small letter words in front, followed by large letters at the back, in alphabetical order.
        // Uses Timsort, an efficient merge + insertion sort variant. Time Complexity of O(NLogN)
        Collections.sort(parrotNamesList);

        // [Charlie, Goldie, Lucy, Luna, Max, Pepper, Polly, Rocky, Sam, bob]
        System.out.println(parrotNamesList.toString());

        // Lets find "Lucy" in the sorted Array. expected index is 2
        int lucyIndex = Collections.binarySearch(parrotNamesList, "Lucy");
        System.out.println("lucyIndex: " + lucyIndex);

        // Lets find "bob" in the sorted Array. expected index is 9
        int bobIndex = Collections.binarySearch(parrotNamesList, "bob");
        System.out.println("bobIndex: " + bobIndex);

        // Lets find "Polly" in the sorted Array. expected index is 6
        int pollyIndex = Collections.binarySearch(parrotNamesList, "Polly");
        System.out.println("pollyIndex: " + pollyIndex);
    }
}