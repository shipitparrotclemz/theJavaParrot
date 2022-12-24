import java.util.Arrays;

class ArrayPractice {
    public static void main(String[] args) {
        // Create an array of String with size 10
        String[] arr = new String[5];

        // Initialize the first five elements of the array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = "Parrot " + i;
        }

        // use a for loop to iterate, by index
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // Use a while loop to iterate
        int i = 0;
        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }

        // String allParrots = Arrays.toString(arr);

        // Output: ["Parrot 0", "Parrot 1", "Parrot 2", "Parrot 3", "Parrot 4"]
        // System.out.println(allParrots);
    }
}