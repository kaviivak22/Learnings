package com.tarus.threads;

/*
 * Creating Threads By using Runnable interface (Lambda Expressions).
 */
public class RunnableTestLE {
    public static void main(String[] args) throws Exception {
        int size = 5;


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                System.out.println("Good Morning");

                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"Good Morning Thread*");

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < size; i++) {
                System.out.println("Good Night");
                try {
                    Thread.sleep(2000);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        },"Good night Thread*");
        t1.start();
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        t2.start();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.join();
        t2.join();
        //After join the thread thread alive will be false
        System.out.println(t1.isAlive());
        System.out.println(t2.isAlive());

        System.out.println("Bye");
    }
}
