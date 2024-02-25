package org.example.logs;

import org.junit.Test;

import java.util.logging.Level;
import java.util.logging.Logger;

public class JULTest {
    @Test
    public  void testQuick() {
        Logger logger = Logger.getLogger("org.example.logs.JULTest");
        logger.info("hello jul");

        logger.log(Level.INFO , "info msg");

        String name="jack";
        Integer age=18;
        logger.log(Level.INFO, "用户信息：{0},{1}",new Object[]{name,age});
    }
}
