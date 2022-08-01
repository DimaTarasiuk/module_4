package com.threads.tmp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static int main(String[] args) throws InterruptedException {
                Runnable foo = ()->{
                    Container container = new Container();
                    for(int i=0; i<10000; i++){
                        container.addEntity("foo");
                    }
                };

                List<Thread> threads = new ArrayList<>();
                for(long count = 10; count>0; count--){
                    Thread thread = new Thread(foo);
                    thread.start();
                    threads.add(thread);
                }

                for(Thread thread: threads){
                    thread.join();
                }
return 0;
            }

        }

