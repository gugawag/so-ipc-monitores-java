package com.gugawag.so;

public class ExemploMonitor {
//    static int numero = 0;
    public static void main(String[] args) {
        Somador somador = new Somador();
        Thread thread1 = new Thread(somador);
        Thread thread2 = new Thread(somador);
        thread1.start();
        thread2.start();
    }

//    public static void somar(String numeroThread) {
//        numero++;
//        System.out.println("Thread" + numeroThread + " - " + numero);
//    }
}
