package edu.sla;

class Birds implements edu.sla.Flyable {
    private int flyTime;
    private int id;

    private boolean recursiveMode;

    Birds(int birdsId, boolean mode) {
        id = birdsId;
        // launchTime is random amount between 2 and 10 seconds
        flyTime = 2 + (int)(Math.random() * 8);
        recursiveMode = mode;
    }

    private void countdownIterative() {
        for (int i = flyTime; i > 0; i--) {
            System.out.println("Birds " + id + " Flying in " + i + " seconds.");
            try {
                // wait 1 second (which is same as 1000 milliseconds)
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    private void countdownRecursive(int count) {
        if (count > 0) {
            System.out.println("Birds " + id + " flying in " + count + " seconds.");
            try {
                // wait 1 second (which is same as 1000 milliseconds)
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
            countdownRecursive(count - 1);
        }
    }

    private void fly() {
        System.out.println("Bids " + id + " launching!!!!!!");
        System.out.println("");
    }

    public void run() {
        System.out.println("Birds " + id + " countdown commence.");
        if (recursiveMode) {
            countdownRecursive(flyTime);
        } else {
            countdownIterative();
        }
        fly();
    }
}
