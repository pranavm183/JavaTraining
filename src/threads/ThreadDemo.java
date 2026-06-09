package threads; // Declares that this class belongs to the 'threads' package

class MyThread extends Thread { // Creates a class that extends the Thread class

    // Logic that will be executed by the new thread
    public void run() { // Overrides the run() method of Thread
        System.out.println(" yours Thread is running..."); // Prints a message when the thread executes
    }
}

public class ThreadDemo { // Main class containing the main() method

    public static void main(String[] args) { // Program execution starts here

        MyThread t1 = new MyThread(); // Creates an object of MyThread

        t1.start(); // Starts a new thread and internally calls the run() method
    }
}
