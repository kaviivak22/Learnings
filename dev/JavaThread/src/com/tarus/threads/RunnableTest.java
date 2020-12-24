package com.tarus.threads;

/**
 * Creating Threads By using Runnable interface.
 */
/*
GoodMorningR - GoodMorningRunnable
 */
class GoodMorningR implements Runnable {
    private int size;

    GoodMorningR(int size) {
        this.size = size;
    }


    public void run() {
        for (int i = 0; i < size; i++) {
            System.out.println("Good Morning");

            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

/*
GoodNightR - GoodNightRunnable
 */
class GoodNightR implements Runnable {
    private int size;

    GoodNightR(int size) {
        this.size = size;
    }

    public void run() {
        for (int i = 0; i < size; i++) {

            System.out.println("Good Night");
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}


public class RunnableTest {
    public static void main(String[] a) {
        int size = 5;
        Runnable goodMorning = new GoodMorningR(size);
        Runnable goodNight = new GoodNightR(size);
        Thread t1 = new Thread(goodMorning);
        Thread t2 = new Thread(goodNight);
        t1.start();
        try {
            Thread.sleep(2000);
        } catch (
                Exception e) {
            e.printStackTrace();
        }
        t2.start();
    }

}
