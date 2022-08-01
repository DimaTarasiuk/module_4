package com.threads.tmp;

import java.util.ArrayList;
import java.util.List;

public class Container {
    private static final List<String> list = new ArrayList<>();

    synchronized void addEntity(String s){
        list.add(s);
    }

    int size(){
        return list.size();
    }
}
