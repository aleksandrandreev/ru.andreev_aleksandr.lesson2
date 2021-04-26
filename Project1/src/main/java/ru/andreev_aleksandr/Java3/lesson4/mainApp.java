package ru.andreev_aleksandr.Java3.lesson4;

public class mainApp {


    public static void main(String[] args) {
        MonABC monABC = new MonABC();

        Thread thread1 = new Thread(monABC::printA);
        Thread thread2 = new Thread(monABC::printB);
        Thread thread3 = new Thread(monABC::printC);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
