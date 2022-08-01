package com.threads;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Foo foo = new Foo();
        Thread thread1 = new Thread("thread1");
        Thread thread2 = new Thread("thread2");
        Thread thread3 = new Thread("thread3");


        CompletableFuture.runAsync(()-> {
           foo.second(thread2);
        });
        CompletableFuture.runAsync(()->{
            foo.first(thread1);
        });
        CompletableFuture.runAsync(()->{
            foo.third(thread3);
        });

        Thread.sleep(1000);
    }
}
