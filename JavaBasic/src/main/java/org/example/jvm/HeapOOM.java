package org.example.jvm;

import java.util.List;

public class HeapOOM {
     static class OOMObject {}

    public static void main(String[] args) {
        List<OOMObject> list = new java.util.ArrayList<>();
        while (true) {
            list.add(new OOMObject());
        }
    }
}
