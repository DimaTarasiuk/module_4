package com.threads;

import java.util.concurrent.Semaphore;

public class Foo {
    Semaphore sm = new Semaphore(0);
    Semaphore sm2 = new Semaphore(0);
    public void first (Runnable r){
        System.out.println("first");
        sm.release();
    }
    public void second (Runnable r){
        try {
            sm.acquire();
            System.out.println("second");
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        sm2.release();
    }
    public void third (Runnable r){
        try{
            sm2.acquire();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("third");
    }

}
