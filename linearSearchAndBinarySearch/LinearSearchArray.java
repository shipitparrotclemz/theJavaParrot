public class LinearSearchArray {
    public static int linearSearch(String[] parrots, String name) {
        /**
         * Returns the index of the parrot with the name, from a String Array of parrots
         * Time Complexity: O(N), N is the size of the parrots String[]
         * Space Complexity: O(1), memory required is constant. not increased with N.
         */
        for (int index = 0; index < parrots.length; index++) {
            /**
             * The Strings here are objects, with their own memory address, or reference
             * Doing a direct comparison with `==` will compare them by memory references,
             * instead of their String value
             * Use the .equals method on the String object to compare it with another String instead.
             * **/
            String parrot = parrots[index];
            if (parrot.equals(name)) {
                return index;
            }
        }
        // If parrot doesn't exist, return -1
        return -1;
    }

    public static void main(String[] args) {
        String[] parrots = {"Polly", "Sam", "Bob"};
        int bobIndex = LinearSearchArray.linearSearch(parrots, "Bob");
        System.out.println(bobIndex);
    }
}