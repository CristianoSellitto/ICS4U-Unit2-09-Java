/*
* This program uses a vehicle class to make two different vehicles
*
* @author  Cristiano Sellitto
* @version 1.0
* @since   2024-04-09
*/

/**
* This is the program.
*/
final class Stacks {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Stacks() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Constants
        final double speedMod = 10;
        final double speedModTwo = 2;
        final String newSpeedText = "New speed: ";
        final String airPressureText = "air pressure of 10 for 10 seconds";

        // Add big truck
        final Truck bigTruck = new Truck("Grey", 200, "HGC-3456F");
        System.out.println("Created a Big Truck.\nStatus:");
        System.out.println(bigTruck.getStatus());

        // Test 1
        System.out.println(
                "\nAccelerating the truck with a power of 20 for 10 seconds"
        );
        bigTruck.accelerate(speedMod + speedMod, speedMod);
        System.out.println(newSpeedText + bigTruck.getSpeed());
        System.out.println(
                "Braking the truck with a power of 10, " + airPressureText
        );
        bigTruck.brake(speedMod, speedMod, speedMod);
        System.out.println(newSpeedText + bigTruck.getSpeed());

        // Test 2
        System.out.println(
                "\nAccelerating the truck with a power of 30 for 10 seconds"
        );
        bigTruck.accelerate(speedMod + speedMod + speedMod, speedMod);
        System.out.println(newSpeedText + bigTruck.getSpeed());
        System.out.println(
                "Braking the truck with a power of 2, " + airPressureText
        );
        bigTruck.brake(speedModTwo, speedMod, speedMod);
        System.out.println(newSpeedText + bigTruck.getSpeed());

        // Test 3
        System.out.println(
                "\nBraking the truck with a power of 10, " + airPressureText
        );
        bigTruck.brake(speedMod, speedMod, speedMod);
        System.out.println(newSpeedText + bigTruck.getSpeed());

        // Show the program as done
        System.out.println("\nDone.");
    }
}
