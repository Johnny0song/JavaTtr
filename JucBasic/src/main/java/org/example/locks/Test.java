package org.example.locks;

import javax.lang.model.element.VariableElement;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;
import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Test {
    private ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(ZoneOffset.UTC);
        int minute = now.getMinute();
        System.out.println(minute);
    }


}




















