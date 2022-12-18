class DataTypes {

    // Defined as static, so this class is not an instance attribute of a DataTypes object
    // so we can access this class via DataTypes.Parrot
    static class Parrot {
        String name;
        String species;
        int age;

        public Parrot(String name, String species, int age) {
            this.name = name;
            this.species = species;
            this.age = age;
        }

        public void Squawk() {
            System.out.println("Rawr! Fear me hoomans!");
        }
    }

    public static void main(String[] args) {
        /**
         * Primitives!
         */
        // 1. boolean: a boolean value can only be true or false.
        boolean isTalking = true;

        // 2. char: a char value represents a single character, such as a letter or symbol.
        char favoriteLetter = 'P';

        // 3. int: an int value is a 32-bit integer that can hold values from -2147483648 to 2147483647.
        int numberOfEggs = 50;

        // 4. float: a float value is a single-precision, 32-bit floating-point number.
        float averageWingSpan = 12.5f;

        // 5. double: a double value is a double-precision, 64-bit floating-point number.
        double averageLifespan = 30.0;

        // Other (not so common) primitives:

        // 6. short: a short value is a 16-bit integer that can hold values from -32768 to 32767.
        short numberOfFeathers = 10000;

        // 7. byte: a byte value is an 8-bit integer that can hold values from -128 to 127.
        byte numberOfParrots = 5;

        // 8. long: a long value is a 64-bit integer that can hold values from -9223372036854775808 to 9223372036854775807.
        long numberOfYearsLived = 15;

        // Here are some of the most common and useful Reference Data Types!
        // 1. String: a String is a sequence of characters and is used to represent text.
        String favoriteColor = "green";

        // 2. Array: an array is a collection of variables of the same data type.
        int[] numberOfParrotsPerYear = new int[5];

        // 3. Our own Reference Type, or parrot!
        DataTypes.Parrot myParrot = new DataTypes.Parrot("Peanut", "VeryCuteParrot", 5);

        // This points to the same peanut parrot
        DataTypes.Parrot myOtherReferenceToSameParrot = myParrot;

        // Prints "Peanut"
        System.out.println(myOtherReferenceToSameParrot.name);
    }
}