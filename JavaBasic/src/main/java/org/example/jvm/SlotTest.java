package org.example.jvm;

public class SlotTest {
    public void localVar1() {
        int a = 0;
        System.out.println(a);
        int b = 0;
    }

    public void localVar2() {
        {
            int a = 0;
            System.out.println(a);
        }
        // 此时b就会复用a的槽位
        int b = 0;
    }
}
