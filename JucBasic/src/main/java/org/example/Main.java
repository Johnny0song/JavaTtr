package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
        System.out.println(snow1);

        List<Snow> snow2 = Arrays.asList(
                new Light(), new Heavy());
        System.out.println(snow2);
    }
}

class A{
    static String a="hh";
}

class Snow {}
class Powder extends Snow {}
class Light extends Powder {}
class Heavy extends Powder {}
class Crusty extends Snow {}
class Slush extends Snow {}