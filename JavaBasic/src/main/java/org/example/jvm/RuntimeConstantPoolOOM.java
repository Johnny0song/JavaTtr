package org.example.jvm;

import java.util.Set;

public class RuntimeConstantPoolOOM {
    public static void main(String[] args) {
        Set<String> set = new java.util.HashSet<>();
        short i = 0;
        while (true) {
            set.add(String.valueOf(i++).intern());
        }
    }
}

