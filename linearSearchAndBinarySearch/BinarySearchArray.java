import java.util.Arrays;
import java.util.Collections;

class BinarySearchArray {
    public static int binarySearch(String[] parrots, String target) {
        /**
         * Search for a target parrot from a sorted Array of parrots
         */
        int leftIndex = 0;
        int rightIndex = parrots.length - 1;

        while (leftIndex <= rightIndex) {
            // Floor division sum of left and right index. Math.floor(3, 2) gives 1
            // Math.floor gives a double. cast it to an int
            int midIndex = (int) Math.floor( (leftIndex + rightIndex) / 2);
            String midParrot = parrots[midIndex];
            if (midParrot.equals(target)) {
                return midIndex;
            } else if (midParrot.compareTo(target) < 0) {
                // midParrot is lexicographically smaller than target
                // target is somewhere from midIndex + 1, inclusive, to rightIndex, inclusive
                // set search window to midIndex + 1, to rightIndex
                leftIndex = midIndex + 1;
            } else {
                // target is somewhere from leftIndex, inclusive, to midIndex - 1, inclusive
                // set search window to leftIndex, to midIndex - 1
                rightIndex = midIndex - 1;
            }
        }
        // if leftIndex > rightIndex (I.E somehow leftIndex moves to the right of rightIndex)
        // it means that we failed to find the target. return -1 as an invalid index.
        return -1;
    }

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
        int lucyIndex = BinarySearchArray.binarySearch(parrotNames, "Lucy");
        System.out.println("lucyIndex: " + lucyIndex);

        // Lets find "bob" in the sorted Array. expected index is 9
        int bobIndex = BinarySearchArray.binarySearch(parrotNames, "bob");
        System.out.println("bobIndex: " + bobIndex);

        // Lets find "Polly" in the sorted Array. expected index is 6
        int pollyIndex = BinarySearchArray.binarySearch(parrotNames, "Polly");
        System.out.println("pollyIndex: " + pollyIndex);
    }
}