class ConditionalStatements {
    public static void main(String[] args) {
        String seeds = "sunflower";

        if (seeds.equals("sunflower")) {
            System.out.println("Eating sunflower seeds.");
        } else if (seeds.equals("millet")) {
            System.out.println("I will peck your meat, how dare you give me millet seeds.");
        } else {
            System.out.println("No sunflower seeds... sad...");
        }
    }
}