package com.mycompany.cronometerthread;

/**
 *
 * @author ieren
 */
public class cronometerThread implements Runnable {

    private Thread x;
    private String threadName;

    public cronometerThread(String threadName) {
        this.threadName = threadName;
        System.out.println("Processing : " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Forming : " + threadName);

        try {
            for (int i = 0; i < 10; i++) {
                System.out.println(threadName + " : " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException exception) {
            System.out.println("Some error happened : " + threadName);
        }
        System.out.println("Thread ended : " + threadName);
    }

    public void start() {
        System.out.println("Thread object is forming");
        if (x == null) {
            x = new Thread(this, threadName);
            x.start();
        }
    }
}
