/*
 * In this program, we have demonstrated four different cases of multithreading:

Case 1: Extending Thread class: We create a class MyThread that extends the 
Thread class and overrides the run() method. We then create an instance of 
MyThread and start the thread using the start() method.

Case 2: Implementing Runnable interface: We create a class MyRunnable that 
implements the Runnable interface and overrides the run() method. We then 
create an instance of MyRunnable, create a Thread object by passing the 
instance to the constructor, and start the thread using the start() method.

Case 3: Anonymous class: Here, we create an anonymous class that implements 
the Runnable interface and overrides the run() method. We directly pass this 
anonymous class to the Thread constructor and start the thread.

Case 4: Lambda expression: This is a concise way to represent an implementation 
of the Runnable interface. We use a lambda expression to define the run() 
method and pass it directly to the Thread constructor.
 */
public class MultithreadingExample {
    public static void main(String[] args) {
        // Case 1: Extending Thread class
        Thread thread1 = new MyThread();
        thread1.start();

        // Case 2: Implementing Runnable interface
        Runnable myRunnable = new MyRunnable();
        Thread thread2 = new Thread(myRunnable);
        thread2.start();

        // Case 3: Anonymous class
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread 3 is running.");
            }
        });
        thread3.start();

        // Case 4: Lambda expression
        Thread thread4 = new Thread(() -> {
            System.out.println("Thread 4 is running.");
        });
        thread4.start();
    }
}

// Thread class
class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("Thread 1 is running.");
    }
}

// Runnable interface
class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread 2 is running.");
    }
}

