package com.tarus.threads;

/**
 * Creating Threads By Extends Thread
 */
class GoodMorning extends Thread {
    private int size ;

    GoodMorning(int size) {
        this.size = size;
    }


    public void run() {
        for (int i = 0; i < size; i++) {
            System.out.println("Good Morning");

            try{Thread.sleep(2000);}catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class GoodNight extends Thread {
    private int size ;

    GoodNight(int size) {
        this.size = size;
    }

    public void run() {
        for (int i = 0; i < size; i++) {

            System.out.println("Good Night");
            try{Thread.sleep(2000);}catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

public class ThreadTest {

    public static void main(String[] a) {
        int size = 5;
        GoodMorning goodMorning = new GoodMorning(size);

        GoodNight goodNight = new GoodNight(size);
        goodMorning.run();
        try{Thread.sleep(2000);}catch (Exception e){
            e.printStackTrace();
        }

        goodNight.run();
    }

}
