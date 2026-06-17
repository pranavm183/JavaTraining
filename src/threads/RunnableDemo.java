package threads; // Declares that this class belongs to the 'threads' package

// Class implementing the Runnable interface
class MyRunnable implements Runnable {

    @Override // Indicates that this method overrides Runnable's run() method
    public void run() {
        System.out.println("Runnable Thread is running1..."); // Prints a message when this thread runs
    }
}

// Another class implementing the Runnable interface
class MyRunnable2 implements Runnable {

    public void run() {
        System.out.println("Runnable Thread is running2..."); // Prints a message when this thread runs
    }
}

// Third class implementing the Runnable interface
class MyRunnable3 implements Runnable {

    public void run() {
        System.out.println("Runnable Thread is running3..."); // Prints a message when this thread runs
    }
}

// Main class
public class RunnableDemo {

    public static void main(String[] args) {

        MyRunnable2 r = new MyRunnable2(); // Creates an object of MyRunnable2

        Thread t = new Thread(r); // Creates a Thread object and passes the Runnable object

        t.start(); // Starts the thread and internally calls r.run()
    }
}