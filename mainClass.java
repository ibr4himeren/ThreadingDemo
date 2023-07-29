package com.mycompany.cronometerthread;

/**
 *
 * @author ieren
 */
public class mainClass {

    public static void main(String[] args) {
        cronometerThread thread1 = new cronometerThread("thread1");

        cronometerThread thread2 = new cronometerThread("thread2");

        cronometerThread thread3 = new cronometerThread("thread3");

        thread1.start();
        thread2.start();
        thread3.start();

    }
}
