// package OPPS.Thread;

public class DemoThread extends Thread {
    private SharedCounter counter;

    public DemoThread(SharedCounter counter) {
        this.counter = counter;
    }

    public void run() {
        System.out.println("Thread: " + getName() + " is running");
        try {
            // Access shared object
            counter.increment();
            // Pause the thread
            Thread.sleep(1500);
            System.out.println("Thread " + getName() + " woke up");
        } catch (InterruptedException e) {
            System.out.println("Thread " + getName() + " was interrupted");
        }
    }

    public static void main(String[] args) {
        // Create shared object
        SharedCounter sharedCounter = new SharedCounter();

        // Create two thread objects
        DemoThread thread1 = new DemoThread(sharedCounter);
        DemoThread thread2 = new DemoThread(sharedCounter);

        // Set names
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        // Start threads
        thread1.start();
        thread2.start();

        try {
            // Main thread waits for child threads
            thread1.join();
            thread2.join();
            System.out.println("Main thread finished waiting");
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted");
        }
    }
}

// Shared object class
class SharedCounter {
    private int count = 0;

    // Synchronized method
    public synchronized void increment() {
        count++;
        System.out.println("Count incremented to: " + count + " by " + Thread.currentThread().getName());
    }
}
