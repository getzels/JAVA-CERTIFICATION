package io.keyzelsoft.concurrency;

import org.junit.jupiter.api.Test;

public class ThreadTest {

    @Test
    public void runThreadByExtendingThread() throws InterruptedException {

        System.out.println("Main thread: " + Thread.currentThread().getName() + " is begin executed.");
        System.out.println("Main thread: " + Thread.currentThread().getState() + " state.");

        MyThread thread = new MyThread();
        thread.start();
    }

    @Test
    public void runThreadByExtendingRunnable() throws InterruptedException {
        System.out.println("Main thread: " + Thread.currentThread().getName() + " is begin executed.");
        System.out.println("Main thread: " + Thread.currentThread().getState() + " state.");

        MyRunnable runnable = new MyRunnable();
        new Thread(runnable).start();
    }

    //implementing Runnable with lambda expression
    @Test
    public void runThreadByExtendingCallable() throws InterruptedException {
        System.out.println("Main thread: " + Thread.currentThread().getName() + " is begin executed.");
        System.out.println("Main thread: " + Thread.currentThread().getState() + " state.");

        new Thread(() -> {
            System.out.println("Thread: " + Thread.currentThread().getName() + " is begin executed.");
            System.out.println("thread: " + Thread.currentThread().getState() + " state.");
        }).start();
    }
}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + " is begin executed.");
        System.out.println("thread: " + Thread.currentThread().getState() + " state.");
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Thread: " + Thread.currentThread().getName() + " is begin executed.");
        System.out.println("thread: " + Thread.currentThread().getState() + " state.");
    }
}
