package _1;

public class Exercises {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * Create a class called "Dog" that extends the Animal class.
     *
     * Add a new field called "breed" to the Dog class.
     *
     * Write a constructor for the Dog class that takes in a breed, height, and weight as parameters, and passes the height and weight to the superclass constructor.
     *
     * Write getters and setters for the breed field.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Dog cane1 = new Dog(53.5,20.5, "Siberian Husky");
        Dog cane2 = new Dog(25.0,11.0, "Corgi");
        cane1.setBreed("Siberian Husky");
        cane2.setBreed("Corgi");

        System.out.println("breed = " + cane1.getBreed() + " height = " + cane1.getHeight() + " weight = " + cane1.getWeight());
        System.out.println("breed = " + cane2.getBreed() + " height = " + cane2.getHeight() + " weight = " + cane2.getWeight());
    }

    /**
     * 2:
     *
     *
     * Create new classes called "Fish" and "Bird" that extends the Animal class.
     *
     * Add a new field called "species" to the Fish class and "wingSpan" to the Bird class.
     *
     * Also create constructors, getters and setters
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Fish merluzzo = new Fish(150.00,35.00, "Merluzzo");
        Bird gabbiano = new Bird(60.5,1.45, 1.35);

        System.out.println("Merluzzo - weight = " +merluzzo.getWeight());
    }


    /**
     * 3:
     *
     * In the dog class create a method called runSpeedMetersPerSecond() that returns the Dog's Height * 2
     * In the fish class create a method called swimSpeedMetersPerSecond() that returns the Fish's Weight * 2
     * In the bird class create a method called flySpeedMetersPerSecond() that returns the Bird's Wingspan * 4
     *
     * Create instances of each Animal: Dog, Fish and Bird. Fill the constructors with values of your choice
     * and print out which of the animals has the fastest movement speed in MetersPerSecond
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Dog cane = new Dog(15,10,"cane");
        Bird uccello = new Bird(12, 14, 7);
        Fish pesce = new Fish(13,13,"pesce");
        uccello.setWingSpan(7);

        if (cane.runSpeedMetersPerSecond() > uccello.flySpeedMetersPerSecond() && cane.runSpeedMetersPerSecond() > pesce.swimSpeedMetersPerSecond()){
            System.out.println("il cane è più veloce");
        } else if (uccello.flySpeedMetersPerSecond() > cane.runSpeedMetersPerSecond() && uccello.flySpeedMetersPerSecond() > pesce.swimSpeedMetersPerSecond()) {
            System.out.println("l'uccello è più veloce");
        } else {
            System.out.println("il pesce è più veloce");
        }
    }
}
