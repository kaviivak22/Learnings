package com.tarus.threads;

import java.util.ArrayList;
import java.util.List;

/**
 * Array Not Synchronized
 */
public class ArrayListSynchroProblem implements Runnable {

    private List<Integer> numList;

    ArrayListSynchroProblem(List<Integer> numList) {
        this.numList = numList;
    }

    @Override
    public void run() {
        System.out.println("in run method");
        for (int i = 0; i < 10; i++) {
            numList.add(i);
            try {
                // introducing some delay
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<Integer>();
        // Creating three threads
        Thread t1 = new Thread(new ArrayListSynchroProblem(numList));
        Thread t2 = new Thread(new ArrayListSynchroProblem(numList));
        Thread t3 = new Thread(new ArrayListSynchroProblem(numList));
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Size of list is " + numList.size());
        for(Integer i : numList){
            System.out.println("num - " + i);
        }
    }

}
