package com.gugawag.so;

public class Somador implements Runnable {
    int numero = 0;

    @Override
    public synchronized void run() {
        while (true) {
            numero++;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread" + this.toString() + " - " + numero);
        }
    }
}
