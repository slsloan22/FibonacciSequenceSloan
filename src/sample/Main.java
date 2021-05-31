package edu.sla;

public class Main {

    public static void main(String[] args) {
        boolean recursiveMode = false;
        int numBirds = 2;

        System.out.println("Will fly " + numBirds + " Birds" + (recursiveMode ? " recursively." : " iteratively."));
        System.out.println("");

        // Let's launch some rockets
        for (int i = 0; i < numBirds; i++) {
            Flyable birds = new Bird(i+1, recursiveMode);
            bird.run();
        }

        System.out.println("All Rockets launched successfully!");
    }
}
