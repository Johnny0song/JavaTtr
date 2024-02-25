package org.example.colandmap;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveTest {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
            if(next == 2){
                iterator.remove();
            }
        }
        System.out.println(integers);

    }
}
