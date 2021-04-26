package com.app.tests;

import com.app.runnables.AppThread;

public class TestThreads {
    public static void main(String[] args) {
        AppThread thread1 = new AppThread();
        AppThread thread2 = new AppThread();
        AppThread thread3 = new AppThread();

        thread1.start();
        thread2.start();
        thread3.start();

//        There are 3 states for a thread
//        1. RUNNABLE
//        2. RUNNING
//        3. TERMINATED/DEAD
//        There is an additional sleep state when the thread
//        is waiting for a resource or it is blocked
    }
}
