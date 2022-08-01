package com.threads.questions;

import java.util.concurrent.*;

public class Coviralka {

    Future future = new Future() {
        @Override
        public boolean cancel(boolean mayInterruptIfRunning) {
            return false;
        }

        @Override
        public boolean isCancelled() {
            return false;
        }

        @Override
        public boolean isDone() {
            return false;
        }

        @Override
        public Object get() throws InterruptedException, ExecutionException {
            return null;
        }

        @Override
        public Object get(long timeout, TimeUnit unit) throws InterruptedException, ExecutionException, TimeoutException {
            return null;
        }
    }
    Callable<String> callable = new Callable<String>() {
        @Override
        public String call()throws Exception{
            Thread.sleep(1000);
            return "Sttirng";
        }
    };


    public class Liambda {
        Callable callable2 = () ->{
            Thread.sleep(2000);
            return true;
        };
    }
}

